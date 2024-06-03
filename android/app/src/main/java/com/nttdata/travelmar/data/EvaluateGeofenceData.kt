package com.nttdata.travelmar.data

data class EvaluateGeofenceData(
    var coordinates: List<Double?>? = null,
    var eventTime: String? = null,
    var geofenceCollection: String? = null,
    var geofenceId: String? = null,
    var source: String? = null,
    var stopName: String? = null,
    var trackerEventType: String? = null
)
