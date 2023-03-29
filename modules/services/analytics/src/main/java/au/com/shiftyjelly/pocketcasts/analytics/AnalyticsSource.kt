package au.com.shiftyjelly.pocketcasts.analytics

enum class AnalyticsSource(val analyticsValue: String) {
    PODCAST_SCREEN("podcast_screen"),
    WATCH_PODCAST_SCREEN("watch_podcast_screen"),
    PODCAST_LIST("podcast_list"),
    FILTERS("filters"),
    DISCOVER("discover"),
    DISCOVER_PODCAST_LIST("discover_podcast_list"),
    DISCOVER_RANKED_LIST("discover_ranked_list"),
    DISCOVER_PLAIN_LIST("discover_plain_list"),
    DOWNLOADS("downloads"),
    FILES("files"),
    STARRED("starred"),
    LISTENING_HISTORY("listening_history"),
    EPISODE_DETAILS("episode_details"),
    WATCH_EPISODE_DETAILS("watch_episode_details"),
    MINIPLAYER("miniplayer"),
    PLAYER("player"),
    WATCH_PLAYER("watch_player"),
    NOTIFICATION("notification"),
    FULL_SCREEN_VIDEO("full_screen_video"),
    UP_NEXT("up_next"),
    WATCH_UP_NEXT("watch_up_next"),
    MEDIA_BUTTON_BROADCAST_ACTION("media_button_broadcast_action"),
    MEDIA_BUTTON_BROADCAST_SEARCH_ACTION("media_button_broadcast_search_action"),
    PLAYER_BROADCAST_ACTION("player_broadcast_action"),
    CHROMECAST("chromecast"),
    AUTO_PLAY("auto_play"),
    AUTO_PAUSE("auto_pause"),
    PLAYER_PLAYBACK_EFFECTS("player_playback_effects"),
    PODCAST_SETTINGS("podcast_settings"),
    ONBOARDING_RECOMMENDATIONS("onboarding_recommendations"),
    ONBOARDING_RECOMMENDATIONS_SEARCH("onboarding_recommendations_search"),
    UNKNOWN("unknown"),
    TASKER("tasker");

    fun skipTracking() = this in listOf(AUTO_PLAY, AUTO_PAUSE)

    companion object {
        fun fromString(source: String?) =
            AnalyticsSource.values().find { it.analyticsValue == source } ?: UNKNOWN
    }
}
