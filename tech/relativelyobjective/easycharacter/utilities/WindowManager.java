package tech.relativelyobjective.easycharacter.utilities;

import tech.relativelyobjective.easycharacter.pieces.FrameMain;
import tech.relativelyobjective.easycharacter.pieces.tabs.*;

/**
 *
 * @author ReltivlyObjectv
 */
public class WindowManager {
	private static FrameMain frameMain = null;
	private static TabStats statsTab = null;
	private static TabRace raceTab = null;
	private static TabClass classTab = null;
	private static TabMisc miscTab = null;
	public static FrameMain getMainFrame() {
		if (frameMain == null) {
			frameMain = new FrameMain();
		}
		return frameMain;
	}
	public static TabStats getStatsTab() {
		if (statsTab == null) {
			statsTab = new TabStats();
		}
		return statsTab;
	}
	public static TabRace getRaceTab() {
		if (raceTab == null) {
			raceTab = new TabRace();
		}
		return raceTab;
	}
	public static TabClass getClassTab() {
		if (classTab == null) {
			classTab = new TabClass();
		}
		return classTab;
	}
	public static TabMisc getMiscTab() {
		if (miscTab == null) {
			miscTab = new TabMisc();
		}
		return miscTab;
	}
}
