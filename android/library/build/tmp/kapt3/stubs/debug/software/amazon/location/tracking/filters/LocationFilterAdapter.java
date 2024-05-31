package software.amazon.location.tracking.filters;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000fH\u0016\u00a8\u0006\u0011"}, d2 = {"Lsoftware/amazon/location/tracking/filters/LocationFilterAdapter;", "Lcom/google/gson/JsonSerializer;", "Lsoftware/amazon/location/tracking/filters/LocationFilter;", "Lcom/google/gson/JsonDeserializer;", "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "serialize", "filter", "type", "Lcom/google/gson/JsonSerializationContext;", "Companion", "trackingSdk_debug"})
public final class LocationFilterAdapter implements com.google.gson.JsonSerializer<software.amazon.location.tracking.filters.LocationFilter>, com.google.gson.JsonDeserializer<software.amazon.location.tracking.filters.LocationFilter> {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TIME_LOCATION_FILTER = "TimeLocationFilter";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ACCURACY_LOCATION_FILTER = "AccuracyLocationFilter";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String DISTANCE_LOCATION_FILTER = "DistanceLocationFilter";
    @org.jetbrains.annotations.NotNull
    public static final software.amazon.location.tracking.filters.LocationFilterAdapter.Companion Companion = null;
    
    public LocationFilterAdapter() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.google.gson.JsonElement serialize(@org.jetbrains.annotations.NotNull
    software.amazon.location.tracking.filters.LocationFilter filter, @org.jetbrains.annotations.NotNull
    java.lang.reflect.Type type, @org.jetbrains.annotations.NotNull
    com.google.gson.JsonSerializationContext context) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public software.amazon.location.tracking.filters.LocationFilter deserialize(@org.jetbrains.annotations.NotNull
    com.google.gson.JsonElement json, @org.jetbrains.annotations.NotNull
    java.lang.reflect.Type typeOfT, @org.jetbrains.annotations.NotNull
    com.google.gson.JsonDeserializationContext context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lsoftware/amazon/location/tracking/filters/LocationFilterAdapter$Companion;", "", "()V", "ACCURACY_LOCATION_FILTER", "", "DISTANCE_LOCATION_FILTER", "TIME_LOCATION_FILTER", "trackingSdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}