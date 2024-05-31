package software.amazon.location.tracking.providers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\"\u0010\u0016\u001a\u00020\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0002R\u0012\u0010\u0003\u001a\u00060\u0004R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lsoftware/amazon/location/tracking/providers/BackgroundLocationService;", "Landroid/app/Service;", "()V", "binder", "Lsoftware/amazon/location/tracking/providers/BackgroundLocationService$BackgroundLocationServiceBinder;", "locationTracker", "Lsoftware/amazon/location/tracking/LocationTracker;", "locationTrackerConfig", "Lsoftware/amazon/location/tracking/config/LocationTrackerConfig;", "createNotification", "Landroid/app/Notification;", "createNotificationChannel", "", "channelId", "channelName", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", "onDestroy", "onStartCommand", "", "flags", "startId", "stopService", "BackgroundLocationServiceBinder", "Companion", "trackingSdk_debug"})
public final class BackgroundLocationService extends android.app.Service {
    @org.jetbrains.annotations.Nullable
    private software.amazon.location.tracking.LocationTracker locationTracker;
    @org.jetbrains.annotations.Nullable
    private software.amazon.location.tracking.config.LocationTrackerConfig locationTrackerConfig;
    @org.jetbrains.annotations.NotNull
    private final software.amazon.location.tracking.providers.BackgroundLocationService.BackgroundLocationServiceBinder binder = null;
    @org.jetbrains.annotations.Nullable
    private static software.amazon.location.tracking.util.ServiceCallback serviceCallback;
    private static boolean isRunning = false;
    @org.jetbrains.annotations.NotNull
    public static final software.amazon.location.tracking.providers.BackgroundLocationService.Companion Companion = null;
    
    public BackgroundLocationService() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @java.lang.Override
    public int onStartCommand(@org.jetbrains.annotations.Nullable
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    /**
     * Creates a notification for the service.
     * @return The notification instance.
     */
    private final android.app.Notification createNotification() {
        return null;
    }
    
    /**
     * Creates a notification channel for the service.
     * @param channelId The notification channel ID.
     * @param channelName The notification channel name.
     * @return The created notification channel ID.
     */
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final java.lang.String createNotificationChannel(java.lang.String channelId, java.lang.String channelName) {
        return null;
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    /**
     * Stops the background location service.
     * This method is called when the service needs to be stopped.
     * It stops location updates, removes the service from the foreground, and stops the service itself.
     * Additionally, it broadcasts an intent to notify listeners that the service has been stopped.
     */
    private final void stopService() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lsoftware/amazon/location/tracking/providers/BackgroundLocationService$BackgroundLocationServiceBinder;", "Landroid/os/Binder;", "(Lsoftware/amazon/location/tracking/providers/BackgroundLocationService;)V", "trackingSdk_debug"})
    public final class BackgroundLocationServiceBinder extends android.os.Binder {
        
        public BackgroundLocationServiceBinder() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lsoftware/amazon/location/tracking/providers/BackgroundLocationService$Companion;", "", "()V", "isRunning", "", "()Z", "setRunning", "(Z)V", "serviceCallback", "Lsoftware/amazon/location/tracking/util/ServiceCallback;", "getServiceCallback", "()Lsoftware/amazon/location/tracking/util/ServiceCallback;", "setServiceCallback", "(Lsoftware/amazon/location/tracking/util/ServiceCallback;)V", "trackingSdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final software.amazon.location.tracking.util.ServiceCallback getServiceCallback() {
            return null;
        }
        
        public final void setServiceCallback(@org.jetbrains.annotations.Nullable
        software.amazon.location.tracking.util.ServiceCallback p0) {
        }
        
        public final boolean isRunning() {
            return false;
        }
        
        public final void setRunning(boolean p0) {
        }
    }
}