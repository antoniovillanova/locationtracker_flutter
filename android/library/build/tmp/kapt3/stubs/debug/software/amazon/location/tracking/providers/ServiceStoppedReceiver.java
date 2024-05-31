package software.amazon.location.tracking.providers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lsoftware/amazon/location/tracking/providers/ServiceStoppedReceiver;", "Landroid/content/BroadcastReceiver;", "listener", "Lsoftware/amazon/location/tracking/providers/ServiceStoppedReceiver$ServiceStoppedListener;", "(Lsoftware/amazon/location/tracking/providers/ServiceStoppedReceiver$ServiceStoppedListener;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "ServiceStoppedListener", "trackingSdk_debug"})
public final class ServiceStoppedReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull
    private final software.amazon.location.tracking.providers.ServiceStoppedReceiver.ServiceStoppedListener listener = null;
    
    public ServiceStoppedReceiver(@org.jetbrains.annotations.NotNull
    software.amazon.location.tracking.providers.ServiceStoppedReceiver.ServiceStoppedListener listener) {
        super();
    }
    
    @java.lang.Override
    public void onReceive(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lsoftware/amazon/location/tracking/providers/ServiceStoppedReceiver$ServiceStoppedListener;", "", "onServiceStopped", "", "trackingSdk_debug"})
    public static abstract interface ServiceStoppedListener {
        
        public abstract void onServiceStopped();
    }
}