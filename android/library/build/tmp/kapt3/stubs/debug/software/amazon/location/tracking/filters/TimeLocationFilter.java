package software.amazon.location.tracking.filters;

/**
 * Filter that determines if the current location should be uploaded based on a defined time interval.
 * @property timeInterval The time interval in milliseconds between location uploads.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\r"}, d2 = {"Lsoftware/amazon/location/tracking/filters/TimeLocationFilter;", "Lsoftware/amazon/location/tracking/filters/LocationFilter;", "timeInterval", "", "(J)V", "getTimeInterval", "()J", "setTimeInterval", "shouldUpload", "", "currentLocation", "Lsoftware/amazon/location/tracking/database/LocationEntry;", "previousLocation", "trackingSdk_debug"})
public final class TimeLocationFilter implements software.amazon.location.tracking.filters.LocationFilter {
    private long timeInterval;
    
    public TimeLocationFilter(long timeInterval) {
        super();
    }
    
    public final long getTimeInterval() {
        return 0L;
    }
    
    public final void setTimeInterval(long p0) {
    }
    
    /**
     * Checks if the current location should be uploaded based on the elapsed time since the last upload.
     * @param currentLocation The location to evaluate.
     * @param previousLocation The last uploaded location, or null if there is no previous location.
     * @return True if the time since the last upload exceeds the specified interval; false otherwise.
     */
    @java.lang.Override
    public boolean shouldUpload(@org.jetbrains.annotations.NotNull
    software.amazon.location.tracking.database.LocationEntry currentLocation, @org.jetbrains.annotations.Nullable
    software.amazon.location.tracking.database.LocationEntry previousLocation) {
        return false;
    }
    
    public TimeLocationFilter() {
        super();
    }
}