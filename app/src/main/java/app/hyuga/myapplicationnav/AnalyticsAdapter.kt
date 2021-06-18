package app.hyuga.myapplicationnav

import app.hyuga.myapplicationnav.di.AnalyticsService
import javax.inject.Inject

class AnalyticsAdapter @Inject constructor(
    private val service: AnalyticsService
) {
    fun aaa(): String {
        return service.analyticsMethods()
    }
}