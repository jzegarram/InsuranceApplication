/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Insurance;

/**
 *
 * @author jzegarram
 */
public class AssuranceHousing extends Assurance{
    
    private String _location;
    private double _valueLand;
    private float _percentage;
    
    public AssuranceHousing(int policy, String name, float commision, String location, double valueLand, float percentage) {
        super(policy, name, commision);
        _location = location;
        _valueLand = valueLand;
        _percentage = percentage;
    }

    public String getLocation() {
        return _location;
    }

    public void setLocation(String _location) {
        this._location = _location;
    }

    public double getValueLand() {
        return _valueLand;
    }

    public void setValueLand(double _valueLand) {
        this._valueLand = _valueLand;
    }

    public float getPercentage() {
        return _percentage;
    }

    public void setPercentage(float _percentage) {
        this._percentage = _percentage;
    }
    
    @Override
    public void calculatePremium() {
        if( getPercentage() == 100 ) setPremium( (float)(getValueLand() * 0.05) );
        else setPremium( (float)( getValueLand() * ((getPercentage() * 0.05)/100) ));
     
    }
    
    @Override
    public void calculateCoverage() {
        if( getPercentage() == 100 ) setCoverage( getValueLand() );
        else setCoverage( getValueLand() * (getPercentage()/100) );
    }
     

}
