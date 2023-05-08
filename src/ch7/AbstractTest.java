package ch7;

abstract class Player {
    boolean pause;
    int currentPos;

    Player() {
        pause = false;
        currentPos = 0;
    }

    abstract void play(int pos);

    abstract void stop();

    void play() {
        play(currentPos);
    }

    void pause() {
        if (pause) {
            pause = false;
            play(currentPos);
        } else {
            pause = true;
            stop();
        }
    }
}

public class AbstractTest extends Player {
    @Override
    void play(int currentPos) {
    }

    @Override
    void stop() {
    }

    int currentTrack;

    void nextTrack() {
        currentTrack++;
    }

    void preTrack() {
        if (currentTrack > 1) {
            currentTrack--;
        }
    }

}
