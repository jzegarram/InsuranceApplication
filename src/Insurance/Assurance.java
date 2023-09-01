/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Insurance;

/**
 *
 * @author jzegarram
 */
public abstract class Assurance {
    
    private int _policy;
    private String _name;
    private float _premium;
    private double _commission;
    private double _coverage;
    
    public Assurance(int policy, String name, float commision) {
        setPolicy(policy);
        setName(name);
        setPremium(0);
        setCommission(commision);
        setCoverage(0);
    }

    /**
     * @return the _policy
     */
    public int getPolicy() {
        return _policy;
    }

    /**
     * @param _policy the _policy to set
     */
    public void setPolicy(int _policy) {
        this._policy = _policy;
    }

    /**
     * @return the _name
     */
    public String getName() {
        return _name;
    }

    /**
     * @param _name the _name to set
     */
    public void setName(String _name) {
        this._name = _name;
    }

    /**
     * @return the _premium
     */
    public float getPremium() {
        return _premium;
    }

    /**
     * @param _premium the _premium to set
     */
    public void setPremium(float _premium) {
        this._premium = _premium;
    }

    /**
     * @return the _commission
     */
    public double getCommission() {
        return _commission;
    }

    /**
     * @param _commission the _commission to set
     */
    public void setCommission(double _commission) {
        this._commission = _commission;
    }

    /**
     * @return the _coverage
     */
    public double getCoverage() {
        return _coverage;
    }

    /**
     * @param _coverage the _coverage to set
     */
    public void setCoverage(double _coverage) {
        this._coverage = _coverage;
    }

    public abstract void calculatePremium();
    public abstract void calculateCoverage();

}
