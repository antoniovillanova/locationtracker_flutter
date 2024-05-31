package software.amazon.location.tracking.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lsoftware/amazon/location/tracking/util/Logger;", "", "()V", "logLevel", "Lsoftware/amazon/location/tracking/util/TrackingSdkLogLevel;", "getLogLevel", "()Lsoftware/amazon/location/tracking/util/TrackingSdkLogLevel;", "setLogLevel", "(Lsoftware/amazon/location/tracking/util/TrackingSdkLogLevel;)V", "tag", "", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "log", "", "message", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "trackingSdk_debug"})
public final class Logger {
    @org.jetbrains.annotations.NotNull
    private static software.amazon.location.tracking.util.TrackingSdkLogLevel logLevel = software.amazon.location.tracking.util.TrackingSdkLogLevel.DEBUG;
    @org.jetbrains.annotations.NotNull
    private static java.lang.String tag = "Logger";
    @org.jetbrains.annotations.NotNull
    public static final software.amazon.location.tracking.util.Logger INSTANCE = null;
    
    private Logger() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final software.amazon.location.tracking.util.TrackingSdkLogLevel getLogLevel() {
        return null;
    }
    
    public final void setLogLevel(@org.jetbrains.annotations.NotNull
    software.amazon.location.tracking.util.TrackingSdkLogLevel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTag() {
        return null;
    }
    
    public final void setTag(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    /**
     * Log a message with an optional exception.
     *
     * @param message The log message.
     * @param exception An optional exception to include in the log entry.
     */
    public final void log(@org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.Nullable
    java.lang.Exception exception) {
    }
}