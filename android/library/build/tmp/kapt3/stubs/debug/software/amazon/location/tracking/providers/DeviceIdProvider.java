package software.amazon.location.tracking.providers;

/**
 * Class providing Device Id generated with UUID.
 *
 * @constructor Creates a DeviceIdProvider object with the Context.
 *
 * @param context The application context.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lsoftware/amazon/location/tracking/providers/DeviceIdProvider;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "awsKeyValueStore", "Lcom/amazonaws/internal/keyvaluestore/AWSKeyValueStore;", "generateDeviceID", "", "getDeviceID", "resetDeviceID", "", "setDeviceID", "newDeviceID", "Companion", "trackingSdk_debug"})
public final class DeviceIdProvider {
    @org.jetbrains.annotations.NotNull
    private com.amazonaws.internal.keyvaluestore.AWSKeyValueStore awsKeyValueStore;
    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private static volatile software.amazon.location.tracking.providers.DeviceIdProvider instance;
    @org.jetbrains.annotations.NotNull
    public static final software.amazon.location.tracking.providers.DeviceIdProvider.Companion Companion = null;
    
    public DeviceIdProvider(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    /**
     * Method to get the deviceId
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDeviceID() {
        return null;
    }
    
    /**
     * Method to clear the deviceId
     */
    public final void resetDeviceID() {
    }
    
    /**
     * Method to set the deviceId, generates one if not provided
     * @param newDeviceID The new deviceId to be set
     */
    private final void setDeviceID(java.lang.String newDeviceID) {
    }
    
    /**
     * Helper method to generate a new deviceId
     */
    private final java.lang.String generateDeviceID() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lsoftware/amazon/location/tracking/providers/DeviceIdProvider$Companion;", "", "()V", "instance", "Lsoftware/amazon/location/tracking/providers/DeviceIdProvider;", "getInstance", "context", "Landroid/content/Context;", "trackingSdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final software.amazon.location.tracking.providers.DeviceIdProvider getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}