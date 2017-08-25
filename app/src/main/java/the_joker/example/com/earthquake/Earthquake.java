package the_joker.example.com.earthquake;

public class Earthquake {

    private double mMagnitude;
    private String mLocation, mUrl;
    private long mTimeInMilliseconds;


    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude=magnitude;
        mLocation=location;
        mTimeInMilliseconds=timeInMilliseconds;
        mUrl=url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public Long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl() {
        return mUrl;
    }
}