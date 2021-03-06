package com.example.video_player_manager.player_messages;

import com.example.video_player_manager.PlayerMessageState;
import com.example.video_player_manager.manager.VideoPlayerManagerCallback;
import com.example.video_player_manager.ui.VideoPlayerView;

public class Reset extends PlayerMessage {
    public Reset(VideoPlayerView videoPlayerView,
            VideoPlayerManagerCallback callback) {
        super(videoPlayerView, callback);
    }

    @Override
    protected void performAction(VideoPlayerView currentPlayer) {
        currentPlayer.reset();
    }

    @Override
    protected PlayerMessageState stateBefore() {
        return PlayerMessageState.RESETTING;
    }

    @Override
    protected PlayerMessageState stateAfter() {
        return PlayerMessageState.RESET;
    }
}
