package software.amazon.location.tracking.config;

/**
 * Configuration for the LocationTracker.
 * @property trackerName the name of the tracker to use
 * @property locationFilters filters to apply for location updates
 * @property logLevel the log level for SDK logging
 * @property accuracy the desired accuracy for location updates
 * @property latency the maximum latency for location updates
 * @property frequency the desired frequency for location updates
 * @property waitForAccurateLocation flag to wait for an accurate location
 * @property minUpdateIntervalMillis the minimum interval between location updates
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b0\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\bH\u00c6\u0003J\t\u00107\u001a\u00020\nH\u00c6\u0003J\t\u00108\u001a\u00020\fH\u00c6\u0003J\t\u00109\u001a\u00020\fH\u00c6\u0003J\t\u0010:\u001a\u00020\u000fH\u00c6\u0003J\t\u0010;\u001a\u00020\fH\u00c6\u0003J\t\u0010<\u001a\u00020\u0012H\u00c6\u0003Ji\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u00c6\u0001J\u0013\u0010>\u001a\u00020\u000f2\b\u0010?\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010@\u001a\u00020\nH\u00d6\u0001J\t\u0010A\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0010\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b\'\u0010\u001bR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103\u00a8\u0006B"}, d2 = {"Lsoftware/amazon/location/tracking/config/LocationTrackerConfig;", "", "trackerName", "", "locationFilters", "", "Lsoftware/amazon/location/tracking/filters/LocationFilter;", "logLevel", "Lsoftware/amazon/location/tracking/util/TrackingSdkLogLevel;", "accuracy", "", "latency", "", "frequency", "waitForAccurateLocation", "", "minUpdateIntervalMillis", "persistentNotificationConfig", "Lsoftware/amazon/location/tracking/config/NotificationConfig;", "(Ljava/lang/String;Ljava/util/List;Lsoftware/amazon/location/tracking/util/TrackingSdkLogLevel;IJJZJLsoftware/amazon/location/tracking/config/NotificationConfig;)V", "getAccuracy", "()I", "setAccuracy", "(I)V", "getFrequency", "()J", "setFrequency", "(J)V", "getLatency", "setLatency", "getLocationFilters", "()Ljava/util/List;", "setLocationFilters", "(Ljava/util/List;)V", "getLogLevel", "()Lsoftware/amazon/location/tracking/util/TrackingSdkLogLevel;", "setLogLevel", "(Lsoftware/amazon/location/tracking/util/TrackingSdkLogLevel;)V", "getMinUpdateIntervalMillis", "setMinUpdateIntervalMillis", "getPersistentNotificationConfig", "()Lsoftware/amazon/location/tracking/config/NotificationConfig;", "setPersistentNotificationConfig", "(Lsoftware/amazon/location/tracking/config/NotificationConfig;)V", "getTrackerName", "()Ljava/lang/String;", "setTrackerName", "(Ljava/lang/String;)V", "getWaitForAccurateLocation", "()Z", "setWaitForAccurateLocation", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "trackingSdk_debug"})
public final class LocationTrackerConfig {
    @org.jetbrains.annotations.NotNull
    private java.lang.String trackerName;
    @org.jetbrains.annotations.NotNull
    private java.util.List<software.amazon.location.tracking.filters.LocationFilter> locationFilters;
    @org.jetbrains.annotations.NotNull
    private software.amazon.location.tracking.util.TrackingSdkLogLevel logLevel;
    private int accuracy;
    private long latency;
    private long frequency;
    private boolean waitForAccurateLocation;
    private long minUpdateIntervalMillis;
    @org.jetbrains.annotations.NotNull
    private software.amazon.location.tracking.config.NotificationConfig persistentNotificationConfig;
    
    public LocationTrackerConfig(@org.jetbrains.annotations.NotNull
    java.lang.String trackerName, @org.jetbrains.annotations.NotNull
    java.util.List<software.amazon.location.tracking.filters.LocationFilter> locationFilters, @org.jetbrains.annotations.NotNull
    software.amazon.location.tracking.util.TrackingSdkLogLevel logLevel, int accuracy, long latency, long frequency, boolean waitForAccurateLocation, long minUpdateIntervalMillis, @org.jetbrains.annotations.NotNull
    software.amazon.location.tracking.config.NotificationConfig persistentNotificationConfig) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTrackerName() {
        return null;
    }
    
    public final void setTrackerName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<software.amazon.location.tracking.filters.LocationFilter> getLocationFilters() {
        return null;
    }
    
    public final void setLocationFilters(@org.jetbrains.annotations.NotNull
    java.util.List<software.amazon.location.tracking.filters.LocationFilter> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final software.amazon.location.tracking.util.TrackingSdkLogLevel getLogLevel() {
        return null;
    }
    
    public final void setLogLevel(@org.jetbrains.annotations.NotNull
    software.amazon.location.tracking.util.TrackingSdkLogLevel p0) {
    }
    
    public final int getAccuracy() {
        return 0;
    }
    
    public final void setAccuracy(int p0) {
    }
    
    public final long getLatency() {
        return 0L;
    }
    
    public final void setLatency(long p0) {
    }
    
    public final long getFrequency() {
        return 0L;
    }
    
    public final void setFrequency(long p0) {
    }
    
    public final boolean getWaitForAccurateLocation() {
        return false;
    }
    
    public final void setWaitForAccurateLocation(boolean p0) {
    }
    
    public final long getMinUpdateIntervalMillis() {
        return 0L;
    }
    
    public final void setMinUpdateIntervalMillis(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final software.amazon.location.tracking.config.NotificationConfig getPersistentNotificationConfig() {
        return null;
    }
    
    public final void setPersistentNotificationConfig(@org.jetbrains.annotations.NotNull
    software.amazon.location.tracking.config.NotificationConfig p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<software.amazon.location.tracking.filters.LocationFilter> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final software.amazon.location.tracking.util.TrackingSdkLogLevel component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final long component6() {
        return 0L;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final long component8() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final software.amazon.location.tracking.config.NotificationConfig component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final software.amazon.location.tracking.config.LocationTrackerConfig copy(@org.jetbrains.annotations.NotNull
    java.lang.String trackerName, @org.jetbrains.annotations.NotNull
    java.util.List<software.amazon.location.tracking.filters.LocationFilter> locationFilters, @org.jetbrains.annotations.NotNull
    software.amazon.location.tracking.util.TrackingSdkLogLevel logLevel, int accuracy, long latency, long frequency, boolean waitForAccurateLocation, long minUpdateIntervalMillis, @org.jetbrains.annotations.NotNull
    software.amazon.location.tracking.config.NotificationConfig persistentNotificationConfig) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}