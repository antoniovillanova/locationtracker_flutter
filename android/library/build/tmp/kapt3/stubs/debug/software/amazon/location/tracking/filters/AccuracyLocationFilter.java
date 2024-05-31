package software.amazon.location.tracking.filters;

/**
 * Filters location updates by comparing the distance moved since the last update with the current location's accuracy.
 * If the device has moved a distance greater than the current location's accuracy threshold, the location is considered for upload.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016\u00a8\u0006\n"}, d2 = {"Lsoftware/amazon/location/tracking/filters/AccuracyLocationFilter;", "Lsoftware/amazon/location/tracking/filters/LocationFilter;", "()V", "calculateDistance", "", "currentLocation", "Lsoftware/amazon/location/tracking/database/LocationEntry;", "previousLocation", "shouldUpload", "", "trackingSdk_debug"})
public final class AccuracyLocationFilter implements software.amazon.location.tracking.filters.LocationFilter {
    
    public AccuracyLocationFilter() {
        super();
    }
    
    /**
     * Determines if the current location should be uploaded.
     * @param currentLocation The current location to be checked.
     * @param previousLocation The previously uploaded location.
     * @return True if the current location meets the accuracy and movement criteria; false otherwise.
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
}