package software.amazon.location.tracking.filters;

/**
 * Interface defining the contract for location filters.
 * Implementations of this interface determine whether a location should be uploaded based on specific criteria.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lsoftware/amazon/location/tracking/filters/LocationFilter;", "", "shouldUpload", "", "currentLocation", "Lsoftware/amazon/location/tracking/database/LocationEntry;", "previousLocation", "trackingSdk_debug"})
public abstract interface LocationFilter {
    
    /**
     * Determines if a location should be uploaded based on the implemented filter criteria.
     * @param currentLocation The current location to evaluate.
     * @param previousLocation The last uploaded location, or null if there is no previous location.
     * @return True if the current location meets the criteria for upload; false otherwise.
     */
    public abstract boolean shouldUpload(@org.jetbrains.annotations.NotNull
    software.amazon.location.tracking.database.LocationEntry currentLocation, @org.jetbrains.annotations.Nullable
    software.amazon.location.tracking.database.LocationEntry previousLocation);
}