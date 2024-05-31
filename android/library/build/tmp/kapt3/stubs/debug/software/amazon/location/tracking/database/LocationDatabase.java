package software.amazon.location.tracking.database;

/**
 * Database class that provides access to the location entries in persistent storage.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lsoftware/amazon/location/tracking/database/LocationDatabase;", "Landroidx/room/RoomDatabase;", "()V", "locationEntryDao", "Lsoftware/amazon/location/tracking/database/LocationEntryDao;", "trackingSdk_debug"})
@androidx.room.Database(entities = {software.amazon.location.tracking.database.LocationEntry.class}, version = 1)
public abstract class LocationDatabase extends androidx.room.RoomDatabase {
    
    public LocationDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract software.amazon.location.tracking.database.LocationEntryDao locationEntryDao();
}