package software.amazon.location.tracking.config;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lsoftware/amazon/location/tracking/config/SdkConfig;", "", "()V", "DEFAULT_ACCURACY", "", "DEFAULT_DISTANCE_THRESHOLD", "", "DEFAULT_TIME_INTERVAL", "", "MAX_RETRY", "", "trackingSdk_debug"})
public final class SdkConfig {
    public static final long DEFAULT_TIME_INTERVAL = 30000L;
    public static final double DEFAULT_DISTANCE_THRESHOLD = 30.0;
    public static final float DEFAULT_ACCURACY = 0.0F;
    public static final int MAX_RETRY = 3;
    @org.jetbrains.annotations.NotNull
    public static final software.amazon.location.tracking.config.SdkConfig INSTANCE = null;
    
    private SdkConfig() {
        super();
    }
}