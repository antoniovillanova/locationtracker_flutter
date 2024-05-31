package software.amazon.location.tracking;

/**
 * Manages location-related functionality, including tracking and updating device location with AWS location services.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tB\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010!\u001a\u00020\"H\u0002J\u000e\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\"2\u0006\u0010$\u001a\u00020%J\u000e\u0010\'\u001a\u00020\"2\u0006\u0010$\u001a\u00020%J\u001d\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\n\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u0013\u0010-\u001a\u0004\u0018\u00010)H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u0006\u0010/\u001a\u000200J\u0019\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020,H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J\u0010\u00104\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0016\u00105\u001a\u00020\"2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209J\b\u0010:\u001a\u00020\"H\u0007J\u0006\u0010;\u001a\u00020\"J\u0006\u0010<\u001a\u00020\"J\u0006\u0010=\u001a\u00020\"J\u0010\u0010>\u001a\u00020,2\u0006\u0010?\u001a\u00020)H\u0002J\u001f\u0010@\u001a\u00020\"2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020,0BH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010CJ\u001b\u0010@\u001a\u00020\"2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006D"}, d2 = {"Lsoftware/amazon/location/tracking/LocationTracker;", "", "context", "Landroid/content/Context;", "locationCredentialsProvider", "Lsoftware/amazon/location/auth/LocationCredentialsProvider;", "(Landroid/content/Context;Lsoftware/amazon/location/auth/LocationCredentialsProvider;)V", "trackerName", "", "(Landroid/content/Context;Lsoftware/amazon/location/auth/LocationCredentialsProvider;Ljava/lang/String;)V", "clientConfig", "Lsoftware/amazon/location/tracking/config/LocationTrackerConfig;", "(Landroid/content/Context;Lsoftware/amazon/location/auth/LocationCredentialsProvider;Lsoftware/amazon/location/tracking/config/LocationTrackerConfig;)V", "amazonLocationClient", "Lcom/amazonaws/services/geo/AmazonLocationClient;", "getAmazonLocationClient", "()Lcom/amazonaws/services/geo/AmazonLocationClient;", "setAmazonLocationClient", "(Lcom/amazonaws/services/geo/AmazonLocationClient;)V", "awsKeyValueStore", "Lcom/amazonaws/internal/keyvaluestore/AWSKeyValueStore;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "database", "Lsoftware/amazon/location/tracking/database/LocationDatabase;", "httpClient", "Lsoftware/amazon/location/tracking/aws/AmazonTrackingHttpClient;", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "locationProvider", "Lsoftware/amazon/location/tracking/providers/LocationProvider;", "locationTrackingCallback", "Lsoftware/amazon/location/tracking/aws/LocationTrackingCallback;", "cacheClientConfig", "", "checkFilterIsExistsAndUpdateValue", "filter", "Lsoftware/amazon/location/tracking/filters/LocationFilter;", "disableFilter", "enableFilter", "getDeviceLocation", "Landroid/location/Location;", "(Lsoftware/amazon/location/tracking/aws/LocationTrackingCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastKnownLocation", "Lsoftware/amazon/location/tracking/database/LocationEntry;", "getTrackerDeviceLocation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isTrackingInForeground", "", "saveLocationToDisk", "locationEntry", "(Lsoftware/amazon/location/tracking/database/LocationEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "startBackground", "mode", "Lsoftware/amazon/location/tracking/util/BackgroundTrackingMode;", "serviceCallback", "Lsoftware/amazon/location/tracking/util/ServiceCallback;", "startBackgroundLocationUpdates", "stop", "stopBackgroundLocationUpdates", "stopBackgroundService", "toLocationEntry", "it", "uploadLocationUpdates", "locationChunk", "", "([Lsoftware/amazon/location/tracking/database/LocationEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackingSdk_debug"})
public final class LocationTracker {
    @org.jetbrains.annotations.NotNull
    private software.amazon.location.tracking.config.LocationTrackerConfig clientConfig;
    @org.jetbrains.annotations.Nullable
    private software.amazon.location.tracking.aws.LocationTrackingCallback locationTrackingCallback;
    @org.jetbrains.annotations.Nullable
    private software.amazon.location.auth.LocationCredentialsProvider locationCredentialsProvider;
    @org.jetbrains.annotations.NotNull
    private software.amazon.location.tracking.providers.LocationProvider locationProvider;
    @org.jetbrains.annotations.NotNull
    private software.amazon.location.tracking.aws.AmazonTrackingHttpClient httpClient;
    @org.jetbrains.annotations.NotNull
    private com.amazonaws.services.geo.AmazonLocationClient amazonLocationClient;
    @org.jetbrains.annotations.NotNull
    private software.amazon.location.tracking.database.LocationDatabase database;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    @org.jetbrains.annotations.NotNull
    private com.amazonaws.internal.keyvaluestore.AWSKeyValueStore awsKeyValueStore;
    @org.jetbrains.annotations.NotNull
    private com.google.android.gms.location.LocationCallback locationCallback;
    @org.jetbrains.annotations.Nullable
    private android.content.Context context;
    
    public LocationTracker(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    software.amazon.location.auth.LocationCredentialsProvider locationCredentialsProvider) {
        super();
    }
    
    public LocationTracker(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    software.amazon.location.auth.LocationCredentialsProvider locationCredentialsProvider, @org.jetbrains.annotations.NotNull
    java.lang.String trackerName) {
        super();
    }
    
    public LocationTracker(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    software.amazon.location.auth.LocationCredentialsProvider locationCredentialsProvider, @org.jetbrains.annotations.NotNull
    software.amazon.location.tracking.config.LocationTrackerConfig clientConfig) {
        super();
    }
    
    private final void cacheClientConfig() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.amazonaws.services.geo.AmazonLocationClient getAmazonLocationClient() {
        return null;
    }
    
    public final void setAmazonLocationClient(@org.jetbrains.annotations.NotNull
    com.amazonaws.services.geo.AmazonLocationClient p0) {
    }
    
    /**
     * Subscribes to location updates and processes them using the specified callback.
     * @param locationTrackingCallback Callback to handle location updates.
     */
    @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final void start(@org.jetbrains.annotations.NotNull
    software.amazon.location.tracking.aws.LocationTrackingCallback locationTrackingCallback) {
    }
    
    /**
     * Subscribes to background location updates and processes them using the specified callback.
     */
    @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final void startBackgroundLocationUpdates() {
    }
    
    /**
     * Checks if location tracking is currently in progress.
     * @return True if tracking is in progress; false otherwise.
     */
    public final boolean isTrackingInForeground() {
        return false;
    }
    
    /**
     * Unsubscribes from location updates, stopping the location tracking.
     */
    public final void stop() {
    }
    
    /**
     * Unsubscribes from background location updates, stopping the location tracking.
     */
    public final void stopBackgroundLocationUpdates() {
    }
    
    /**
     * Uploads the device location to AWS location services after filtering based on the configured location filters.
     * @param locationTrackingCallback Callback to handle the completion or failure of the location update.
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object uploadLocationUpdates(@org.jetbrains.annotations.Nullable
    software.amazon.location.tracking.aws.LocationTrackingCallback locationTrackingCallback, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Retrieves the current device location from the fused location provider client.
     * @return The current device Location or null if permission is not granted or location is not available.
     */
    @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getDeviceLocation(@org.jetbrains.annotations.Nullable
    software.amazon.location.tracking.aws.LocationTrackingCallback locationTrackingCallback, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super android.location.Location> $completion) {
        return null;
    }
    
    /**
     * Retrieves the device location from AWS location services.
     * @return The device Location from AWS or null if the device location is not found or an error occurs.
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getTrackerDeviceLocation(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super android.location.Location> $completion) {
        return null;
    }
    
    /**
     * Uploads locations to AWS using the Amazon Location Service.
     */
    private final java.lang.Object uploadLocationUpdates(software.amazon.location.tracking.database.LocationEntry[] locationChunk, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final software.amazon.location.tracking.database.LocationEntry getLastKnownLocation() {
        return null;
    }
    
    private final java.lang.Object saveLocationToDisk(software.amazon.location.tracking.database.LocationEntry locationEntry, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final software.amazon.location.tracking.database.LocationEntry toLocationEntry(android.location.Location it) {
        return null;
    }
    
    /**
     * Starts the background location service based on the provided mode.
     * @param mode The mode for background tracking.
     */
    public final void startBackground(@org.jetbrains.annotations.NotNull
    software.amazon.location.tracking.util.BackgroundTrackingMode mode, @org.jetbrains.annotations.NotNull
    software.amazon.location.tracking.util.ServiceCallback serviceCallback) {
    }
    
    /**
     * Stops the background location service.
     */
    public final void stopBackgroundService() {
    }
    
    public final void enableFilter(@org.jetbrains.annotations.NotNull
    software.amazon.location.tracking.filters.LocationFilter filter) {
    }
    
    public final void checkFilterIsExistsAndUpdateValue(@org.jetbrains.annotations.NotNull
    software.amazon.location.tracking.filters.LocationFilter filter) {
    }
    
    public final void disableFilter(@org.jetbrains.annotations.NotNull
    software.amazon.location.tracking.filters.LocationFilter filter) {
    }
}