package software.amazon.location.tracking.filters;

/**
 * Filters location updates based on a specified distance threshold.
 * The filter determines if the distance between the current location and the previous location exceeds the threshold.
 * If it does, the current location is considered significant enough to be uploaded.
 * @param distanceThreshold The minimum distance in meters that needs to be exceeded for the location to be uploaded.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u000e"}, d2 = {"Lsoftware/amazon/location/tracking/filters/DistanceLocationFilter;", "Lsoftware/amazon/location/tracking/filters/LocationFilter;", "distanceThreshold", "", "(D)V", "getDistanceThreshold", "()D", "setDistanceThreshold", "calculateDistance", "currentLocation", "Lsoftware/amazon/location/tracking/database/LocationEntry;", "previousLocation", "shouldUpload", "", "trackingSdk_debug"})
public final class DistanceLocationFilter implements software.amazon.location.tracking.filters.LocationFilter {
    private double distanceThreshold;
    
    public DistanceLocationFilter(double distanceThreshold) {
        super();
    }
    
    public final double getDistanceThreshold() {
        return 0.0;
    }
    
    public final void setDistanceThreshold(double p0) {
    }
    
    /**
     * Determines if the current location should be uploaded.
     * @param currentLocation The current location to be checked.
     * @param previousLocation The previously uploaded location.
     * @return True if the distance between current and previous location is greater than the threshold; false otherwise.
     */
    @java.lang.Override
    public boolean shouldUpload(@org.jetbrains.annotations.NotNull
    software.amazon.location.tracking.database.LocationEntry currentLocation, @org.jetbrains.annotations.Nullable
    software.amazon.location.tracking.database.LocationEntry previousLocation) {
        return false;
    }
    
    /**
     * Calculates the distance between two locations.
     * @param currentLocation Current location.
     * @param previousLocation Previous location.
     * @return The distance in meters.
     */
    private final double calculateDistance(software.amazon.location.tracking.database.LocationEntry currentLocation, software.amazon.location.tracking.database.LocationEntry previousLocation) {
        return 0.0;
    }
    
    public DistanceLocationFilter() {
        super();
    }
}