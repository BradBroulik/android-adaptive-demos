package com.example.bradbroulik.responsivedemos.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 */
public class AppData {

    public final static List<KeyValueItem> HOSPITALS = new ArrayList<>();

    public final static Map<String, KeyValueItem> HOSPITAL_MAP = new HashMap<>();

    static {
        addHospital(new KeyValueItem("1", "Mayo Clinic"));
        addHospital(new KeyValueItem("2", "Johns Hopkins Hospital"));
        addHospital(new KeyValueItem("3", "University of Washington Medical Center"));
        addHospital(new KeyValueItem("4", "Massachusetts General Hospital"));
        addHospital(new KeyValueItem("5", "UCSF Medical Center"));
        addHospital(new KeyValueItem("6", "UCLA Medical Center"));
        addHospital(new KeyValueItem("7", "Stanford Hospital and Clinics"));
        addHospital(new KeyValueItem("8", "City of Hope"));
        addHospital(new KeyValueItem("9", "Cleveland Clinic"));
        addHospital(new KeyValueItem("10", "University of Colorado Hospital"));
        addHospital(new KeyValueItem("11", "Northwestern Memorial Hospital"));
        addHospital(new KeyValueItem("12", "Duke University Hospital"));
    }

    private static void addHospital(KeyValueItem item) {
        HOSPITALS.add(item);
        HOSPITAL_MAP.put(item.id, item);
    }

    public static class KeyValueItem {
        public final String id;
        public final String content;

        public KeyValueItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
