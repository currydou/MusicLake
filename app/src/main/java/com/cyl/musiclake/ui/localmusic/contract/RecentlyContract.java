package com.cyl.musiclake.ui.localmusic.contract;

import com.cyl.musiclake.data.model.Music;
import com.cyl.musiclake.ui.base.BasePresenter;
import com.cyl.musiclake.ui.base.BaseView;

import java.util.List;

public interface RecentlyContract {

    interface View extends BaseView {

        void showSongs(List<Music> songs);

        void showEmptyView();

    }

    interface Presenter extends BasePresenter<View> {

        void loadSongs();

        void clearHistory();
    }
}