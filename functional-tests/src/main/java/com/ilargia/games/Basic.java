package com.ilargia.games;


import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;



public class Basic extends ApplicationAdapter {

    public static void main (String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Drop";
        config.width = 800;
        config.height = 480;
        new LwjglApplication(new Basic(), config);
    }

    @Override
    public void create() {

    }

    @Override
    public void render() {

    }

    @Override
    public void dispose() {


    }
}