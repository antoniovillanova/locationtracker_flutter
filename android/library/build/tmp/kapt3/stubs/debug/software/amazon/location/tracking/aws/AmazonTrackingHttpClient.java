package software.amazon.location.tracking.aws;

/**
 * Handles interactions with Amazon Location tracking.
 * @param context the application context
 * @param trackerName the name of the tracker
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ#\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J)\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lsoftware/amazon/location/tracking/aws/AmazonTrackingHttpClient;", "", "context", "Landroid/content/Context;", "trackerName", "", "(Landroid/content/Context;Ljava/lang/String;)V", "deviceIdProvider", "Lsoftware/amazon/location/tracking/providers/DeviceIdProvider;", "getTrackerDeviceLocation", "Lcom/amazonaws/services/geo/model/GetDevicePositionResult;", "amazonLocationClient", "Lcom/amazonaws/services/geo/AmazonLocationClient;", "(Lcom/amazonaws/services/geo/AmazonLocationClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTrackerDeviceLocation", "Lcom/amazonaws/services/geo/model/BatchUpdateDevicePositionResult;", "location", "Landroid/location/Location;", "(Lcom/amazonaws/services/geo/AmazonLocationClient;Landroid/location/Location;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "locations", "", "(Lcom/amazonaws/services/geo/AmazonLocationClient;[Landroid/location/Location;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackingSdk_debug"})
public final class AmazonTrackingHttpClient {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String trackerName = null;
    @org.jetbrains.annotations.NotNull
    private software.amazon.location.tracking.providers.DeviceIdProvider deviceIdProvider;
    
    public AmazonTrackingHttpClient(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String trackerName) {
        super();
    }
    
    /**
     * Updates a single device location.
     * @param amazonLocationClient the client used to interact with Amazon Location Service
     * @param location the location to update
     * @return BatchUpdateDevicePositionResult containing the result of the update operation
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateTrackerDeviceLocation(@org.jetbrains.annotations.NotNull
    com.amazonaws.services.geo.AmazonLocationClient amazonLocationClient, @org.jetbrains.annotations.NotNull
    android.location.Location location, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.amazonaws.services.geo.model.BatchUpdateDevicePositionResult> $completion) {
        return null;
    }
    
    /**
     * Updates multiple device locations.
     * @param amazonLocationClient the client used to interact with Amazon Location Service
     * @param locations the locations to update
     * @return BatchUpdateDevicePositionResult containing the result of the update operation
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateTrackerDeviceLocation(@org.jetbrains.annotations.NotNull
    com.amazonaws.services.geo.AmazonLocationClient amazonLocationClient, @org.jetbrains.annotations.NotNull
    android.location.Location[] locations, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.amazonaws.services.geo.model.BatchUpdateDevicePositionResult> $completion) {
        return null;
    }
    
    /**
     * Retrieves the current device location.
     * @param amazonLocationClient the client used to interact with Amazon Location Service
     * @return GetDevicePositionResult containing the result of the retrieval operation
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getTrackerDeviceLocation(@org.jetbrains.annotations.NotNull
    com.amazonaws.services.geo.AmazonLocationClient amazonLocationClient, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.amazonaws.services.geo.model.GetDevicePositionResult> $completion) {
        return null;
    }
}