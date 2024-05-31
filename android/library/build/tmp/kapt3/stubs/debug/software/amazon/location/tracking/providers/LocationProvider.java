package software.amazon.location.tracking.providers;

/**
 * LocationProvider is a class that provides methods for retrieving the device's last known location,
 * checking location permission, and subscribing to location updates.
 * @param context The application context.
 * @param locationTrackerConfig The optional configuration for the location client.
 * @property fusedLocationClient The fused location provider client.
 * @property coroutineScope The coroutine scope.
 * @property locationTrackerConfig The optional configuration for the location client.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lsoftware/amazon/location/tracking/providers/LocationProvider;", "", "context", "Landroid/content/Context;", "locationTrackerConfig", "Lsoftware/amazon/location/tracking/config/LocationTrackerConfig;", "(Landroid/content/Context;Lsoftware/amazon/location/tracking/config/LocationTrackerConfig;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getDeviceLocation", "Landroid/location/Location;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscribeToLocationUpdates", "", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "unsubscribeFromLocationUpdates", "trackingSdk_debug"})
public final class LocationProvider {
    @org.jetbrains.annotations.NotNull
    private software.amazon.location.tracking.config.LocationTrackerConfig locationTrackerConfig;
    @org.jetbrains.annotations.NotNull
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    
    public LocationProvider(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    software.amazon.location.tracking.config.LocationTrackerConfig locationTrackerConfig) {
        super();
    }
    
    /**
     * Subscribes to location updates using the provided location callback.
     *
     * The method first checks the availability of the device's location. If the location is available,
     * it requests location updates using the fused location provider client and the provided location callback.
     *
     * @param locationCallback the location callback to be notified of location updates
     */
    @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})
    public final void subscribeToLocationUpdates(@org.jetbrains.annotations.NotNull
    com.google.android.gms.location.LocationCallback locationCallback) {
    }
    
    /**
     * Unsubscribes from location updates.
     *
     * @param locationCallback The [LocationCallback] used to receive location updates.
     *
     * @throws SecurityException if the calling package does not have the
     * necessary permissions.
     */
    public final void unsubscribeFromLocationUpdates(@org.jetbrains.annotations.NotNull
    com.google.android.gms.location.LocationCallback locationCallback) {
    }
    
    /**
     * Retrieves the current location of the device from the fused location provider client
     */
    @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getDeviceLocation(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super android.location.Location> $completion) {
        return null;
    }
}