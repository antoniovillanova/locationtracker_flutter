package software.amazon.location.tracking.database;

/**
 * Interface that defines the Data Access Object (DAO) for LocationEntry entities in the database.
 *
 * This DAO provides methods to perform CRUD operations (insert, retrieve) on LocationEntry entities,
 * as well as querying for entries with specific properties.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lsoftware/amazon/location/tracking/database/LocationEntryDao;", "", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteEntriesByIds", "entryIds", "", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteEntryById", "entryId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllEntries", "Lsoftware/amazon/location/tracking/database/LocationEntry;", "insert", "entry", "(Lsoftware/amazon/location/tracking/database/LocationEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackingSdk_debug"})
@androidx.room.Dao
public abstract interface LocationEntryDao {
    
    @androidx.room.Insert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull
    software.amazon.location.tracking.database.LocationEntry entry, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM location_entries")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllEntries(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<software.amazon.location.tracking.database.LocationEntry>> $completion);
    
    @androidx.room.Query(value = "DELETE FROM location_entries")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM location_entries WHERE id IN (:entryIds)")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteEntriesByIds(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> entryIds, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM location_entries WHERE id = :entryId")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteEntryById(long entryId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}