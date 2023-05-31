package org.base;

import org.pages.*;

public class PagesDriver {
    private static Header header;

    private static AlphaCodersMainPage alphaCodersMainPage;

    private static WallpaperAbbys wallpaperAbbys;

    private static MobileAbbys mobileAbbys;

    private static ArtAbbys artAbbys;

    private static ImagesAbbys imagesAbbys;

    private static AvatarAbbys avatarAbbys;

    private static GifAbbys gifAbbys;

    private static GamesAbbys gamesAbbys;

    private static MoviesAbbys moviesAbbys;
    private static TVAbbys tvAbbys;

    private static DiscussionsAbbys discussionsAbbys;

    private static WaysToHelp waysToHelp;

    private static UsersActivity usersActivity;

    private static SubmitPage submitPage;

    private static LogginationPage logginationPage;

    public static Header getHeader() {
        if(header == null){
            header = new Header();
        }
        return header;
    }

    public static AlphaCodersMainPage getAlphaCodersMainPage() {
        if(alphaCodersMainPage == null){
            alphaCodersMainPage = new AlphaCodersMainPage();
        }
        return alphaCodersMainPage;
    }

    public static WallpaperAbbys getWallpaperAbbys() {
        if(wallpaperAbbys == null){
            wallpaperAbbys = new WallpaperAbbys();
        }
        return wallpaperAbbys;
    }

    public static MobileAbbys getMobileAbbys() {
        if(mobileAbbys == null){
            mobileAbbys = new MobileAbbys();
        }
        return mobileAbbys;
    }

    public static ArtAbbys getArtAbbys() {
        if(artAbbys == null){
            artAbbys = new ArtAbbys();
        }
        return artAbbys;
    }

    public static ImagesAbbys getImagesAbbys() {
        if(imagesAbbys == null){
            imagesAbbys = new ImagesAbbys();
        }
        return imagesAbbys;
    }

    public static AvatarAbbys getAvatarAbbys() {
        if(avatarAbbys == null){
            avatarAbbys = new AvatarAbbys();
        }
        return avatarAbbys;
    }

    public static GifAbbys getGifAbbys() {
        if(gifAbbys == null){
            gifAbbys = new GifAbbys();
        }
        return gifAbbys;
    }

    public static GamesAbbys getGamesAbbys() {
        if(gamesAbbys == null){
            gamesAbbys = new GamesAbbys();
        }
        return gamesAbbys;
    }
    public static MoviesAbbys getMoviesAbbys() {
        if(moviesAbbys == null){
            moviesAbbys  = new MoviesAbbys();
        }
        return moviesAbbys ;
    }

    public static TVAbbys getTvAbbys() {
        if(tvAbbys == null){
            tvAbbys  = new TVAbbys();
        }
        return tvAbbys ;
    }

    public static DiscussionsAbbys getDiscussionsAbbys() {
        if(discussionsAbbys == null){
            discussionsAbbys  = new DiscussionsAbbys();
        }
        return discussionsAbbys;
    }

    public static WaysToHelp getWaysToHelp() {
        if(waysToHelp == null){
            waysToHelp  = new WaysToHelp();
        }
        return waysToHelp;
    }

    public static UsersActivity getUsersActivity() {
        if(usersActivity == null){
            usersActivity  = new UsersActivity();
        }
        return usersActivity;
    }

    public static SubmitPage getSubmitPage() {
        if(submitPage == null){
            submitPage  = new SubmitPage();
        }
        return submitPage;
    }

    public static LogginationPage getLogginationPage() {
        if(logginationPage == null){
            logginationPage  = new LogginationPage();
        }
        return logginationPage;
    }




}