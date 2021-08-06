package com.alfa.work1;

public class Runner {
    public void run() {

        Device[] devices = {
                new Device("AP-0000N2021", "LG", 1000.0),
                new Monitor("PP0007", "LG", 10000.0, 1024, 1280),
                new EthernetAdapter("QQ_4321AA", "LG", 6500.0, 150, "00:26:57:00:1f:02"),
                new EthernetAdapter("QQ_PP2021", "SONY", 12500.0, 200, "01:0C:CD:01:01:21"),
                new Device("SSN_000001", "Samsung", 8000.0),
                new Monitor("ML-2300A", "Samsung", 14000.0, 2048, 1280),
                new Device("AP-0000N2021", "LG", 1000.0),
                new Monitor("PP0007", "LG", 10000.0, 2048, 1280)
        };
        for (Device element : devices) {
            System.out.println(element + "; " + element.hashCode());
        }

        System.out.println(devices[1].equals(devices[7]));
    }
}
