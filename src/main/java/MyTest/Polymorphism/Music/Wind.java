package MyTest.Polymorphism.Music;

/**
 * Created by Chung Time: 下午 05:56 Date: 17-12月-2017
 */
public class Wind extends Instrument {

  public void play(Note note) {
    System.out.println("Wind.play() "+note);
  }

}
