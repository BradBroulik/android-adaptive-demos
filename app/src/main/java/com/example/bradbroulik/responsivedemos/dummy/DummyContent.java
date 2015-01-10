package com.example.bradbroulik.responsivedemos.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> HOSPITALS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> HOSPITAL_MAP = new HashMap<String, DummyItem>();

    static {
        addHospital(new DummyItem("1", "Mayo Clinic"));
        addHospital(new DummyItem("2", "Johns Hopkins Hospital"));
        addHospital(new DummyItem("3", "University of Washington Medical Center"));
        addHospital(new DummyItem("4", "Massachusetts General Hospital"));
        addHospital(new DummyItem("5", "UCSF Medical Center"));
        addHospital(new DummyItem("6", "UCLA Medical Center"));
        addHospital(new DummyItem("7", "Stanford Hospital and Clinics"));
        addHospital(new DummyItem("8", "City of Hope"));
        addHospital(new DummyItem("9", "Cleveland Clinic"));
        addHospital(new DummyItem("10", "University of Colorado Hospital"));
        addHospital(new DummyItem("11", "Northwestern Memorial Hospital"));
        addHospital(new DummyItem("12", "Duke University Hospital"));
    }

    private static void addHospital(DummyItem item) {
        HOSPITALS.add(item);
        HOSPITAL_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String content;

        public DummyItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
