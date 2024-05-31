package software.amazon.location.tracking.aws;

/**
 * Callback interface for location tracking events.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH&J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\fH&J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\fH&\u00a8\u0006\u000e"}, d2 = {"Lsoftware/amazon/location/tracking/aws/LocationTrackingCallback;", "", "onLocationAvailabilityChanged", "", "locationAvailable", "", "onLocationReceived", "location", "Lsoftware/amazon/location/tracking/database/LocationEntry;", "onUploadSkipped", "entries", "onUploadStarted", "", "onUploaded", "trackingSdk_debug"})
public abstract interface LocationTrackingCallback {
    
    /**
     * Called when a new location is received.
     * @param location The new location entry.
     */
    public abstract void onLocationReceived(@org.jetbrains.annotations.NotNull
    software.amazon.location.tracking.database.LocationEntry location);
    
    /**
     * Called when the upload of location entries is started.
     * @param entries The list of location entries to be uploaded.
     */
    public abstract void onUploadStarted(@org.jetbrains.annotations.NotNull
    java.util.List<software.amazon.location.tracking.database.LocationEntry> entries);
    
    /**
     * Called when the location entries have been successfully uploaded.
     * @param entries The list of uploaded location entries.
     */
    public abstract void onUploaded(@org.jetbrains.annotations.NotNull
    java.util.List<software.amazon.location.tracking.database.LocationEntry> entries);
    
    /**
     * Called when the location upload is skipped due to filters.
     */
    public abstract void onUploadSkipped(@org.jetbrains.annotations.NotNull
    software.amazon.location.tracking.database.LocationEntry entries);
    
    /**
     * Called when the location availability changes.
     * @param locationAvailable True if the location is available, false otherwise.
     */
    public abstract void onLocationAvailabilityChanged(boolean locationAvailable);
}