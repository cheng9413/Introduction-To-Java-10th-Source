package MyTest.Polymorphism.Music;

/**
 * Created by Chung Time: 下午 05:58 Date: 17-12月-2017
 */
public class Music {

  public static void tune(Instrument instrument) {
    instrument.play(Note.MIDDLE_C);
  }

  public static void main(String[] args) {
    Wind flute = new Wind();
    tune(flute); //Upcasting
  }

}
