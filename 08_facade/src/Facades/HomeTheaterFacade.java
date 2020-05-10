package Facades;

import Objects.*;

public class HomeTheaterFacade {
	protected Amplifier amp;
	protected Tuner tuner;
	protected DvdPlayer dvd;
	protected CdPlayer cd;
	protected Projector projector;
	protected TheaterLights lights;
	protected Screen screen;
	protected PopcornPopper popper;
 
	public HomeTheaterFacade(Amplifier amp, 
				 Tuner tuner, 
				 DvdPlayer dvd, 
				 CdPlayer cd,
				 Projector projector,
				 Screen screen,
				 TheaterLights lights,
				 PopcornPopper popper) {
 
		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.projector = projector;
		this.screen = screen;
		this.lights = lights;
		this.popper = popper;
	}
 
	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie...");
		this.popper.on();
		this.popper.pop();
		this.lights.dim(10);
		this.screen.down();
		this.projector.on();
		this.projector.wideScreenMode();
		this.amp.on();
		this.amp.setDvd(dvd);
		this.amp.setSurroundSound();
		this.amp.setVolume(5);
		this.dvd.on();
		this.dvd.play(movie);
	}

	public void endMovie() {
		System.out.println("Shutting movie theater down...");
		this.popper.off();
		this.lights.on();
		this.screen.up();
		this.projector.off();
		this.amp.off();
		this.dvd.stop();
		this.dvd.eject();
		this.dvd.off();
	}

	public void listenToCd(String cdTitle) {
		System.out.println("Get ready for an audiopile experence...");
		this.lights.on();
		this.amp.on();
		this.amp.setVolume(5);
		this.amp.setCd(cd);
		this.amp.setStereoSound();
		this.cd.on();
		this.cd.play(cdTitle);
	}

	public void endCd() {
		System.out.println("Shutting down CD...");
		this.amp.off();
		this.amp.setCd(cd);
		this.cd.eject();
		this.cd.off();
	}

	public void listenToRadio(double frequency) {
		System.out.println("Tuning in the airwaves...");
		this.tuner.on();
		this.tuner.setFrequency(frequency);
		this.amp.on();
		this.amp.setVolume(5);
		this.amp.setTuner(tuner);
	}

	public void endRadio() {
		System.out.println("Shutting down the tuner...");
		this.tuner.off();
		this.amp.off();
	}
}
