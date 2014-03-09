package com.example.MyFirstApp;

/**
 * Created by PaulSRice on 2/16/14.
 */
import com.kilobolt.framework.Game;
import com.kilobolt.framework.Graphics;
import com.kilobolt.framework.Screen;
import com.kilobolt.framework.Graphics.ImageFormat;


public class LoadingScreen extends Screen {

    public LoadingScreen(Game game){
        super(game);
    }

    @Override
    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        Assets.menu = g.newImage("collectivegraph.jpg", ImageFormat.RGB565);
        Assets.click = game.getAudio().createSound("explode.ogg");
        game.setScreen(new MainMenuScreen(game));
    }

    @Override
    public void paint(float deltaTime) {


    }


    @Override
    public void pause() {


    }


    @Override
    public void resume() {


    }


    @Override
    public void dispose() {


    }


    @Override
    public void backButton() {


    }
}
