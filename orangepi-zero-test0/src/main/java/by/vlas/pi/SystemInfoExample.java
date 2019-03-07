package by.vlas.pi;

/*
 * #%L
 * **********************************************************************
 * ORGANIZATION  :  Pi4J
 * PROJECT       :  Pi4J :: Java Examples
 * FILENAME      :  SystemInfoExample.java
 *
 * This file is part of the Pi4J project. More information about
 * this project can be found here:  http://www.pi4j.com/
 * **********************************************************************
 * %%
 * Copyright (C) 2012 - 2019 Pi4J
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 *
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

import com.pi4j.platform.Platform;
import com.pi4j.platform.PlatformAlreadyAssignedException;
import com.pi4j.platform.PlatformManager;
import com.pi4j.system.NetworkInfo;
import com.pi4j.system.SystemInfo;

import java.io.IOException;
import java.text.ParseException;

/**
 * @author Viktor Volisov, 2019-03-04
 * <p>
 * This example code demonstrates how to access a few of the system information properties and
 * network information from the OrangePi  board.
 * @author Robert Savage
 */
public class SystemInfoExample {

    public static void main(String[] args) throws InterruptedException, IOException, ParseException, PlatformAlreadyAssignedException {

        // ####################################################################
        //
        // since we are not using the default Raspberry Pi platform, we should
        // explicitly assign the platform as the OrangePi platform.
        //
        // ####################################################################
        PlatformManager.setPlatform(Platform.ORANGEPI);

        // display a few of the available system information properties
        System.out.println("----------------------------------------------------");
        System.out.println("PLATFORM INFO");
        System.out.println("----------------------------------------------------");
        try {
            System.out.print("Platform Name     :  ");
            System.out.println(PlatformManager.getPlatform().getLabel());
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.out.println("--unsupported-- (exception msg: '" + ex.getMessage() + "')");
        }
        try {
            System.out.print("Platform ID       :  ");
            System.out.println(PlatformManager.getPlatform().getId());
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.out.println("--unsupported-- (exception msg: '" + ex.getMessage() + "')");
        }
        System.out.println("----------------------------------------------------");
        System.out.println("HARDWARE INFO");
        System.out.println("----------------------------------------------------");
        try {
            System.out.print("Serial Number     :  ");
            System.out.println(SystemInfo.getSerial());
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.out.println("--unsupported-- (exception msg: '" + ex.getMessage() + "')");
        }
        try {
            System.out.print("CPU Revision      :  ");
            System.out.println(SystemInfo.getCpuRevision());
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.out.println("--unsupported-- (exception msg: '" + ex.getMessage() + "')");
        }
        try {
            System.out.print("CPU Architecture  :  ");
            System.out.println(SystemInfo.getCpuArchitecture());
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.out.println("--unsupported-- (exception msg: '" + ex.getMessage() + "')");
        }
        try {
            System.out.print("CPU Part          :  ");
            System.out.println(SystemInfo.getCpuPart());
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.out.println("--unsupported-- (exception msg: '" + ex.getMessage() + "')");
        }
        try {
            System.out.print("CPU Temperature   :  ");
            System.out.println(SystemInfo.getCpuTemperature());
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.out.println("--unsupported-- (exception msg: '" + ex.getMessage() + "')");
        }
        try {
            System.out.print("CPU Core Voltage  :  ");
            System.out.println(SystemInfo.getCpuVoltage());
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.out.println("--unsupported-- (exception msg: '" + ex.getMessage() + "')");
        }
        try {
            System.out.print("CPU Model Name    :  ");
            System.out.println(SystemInfo.getModelName());
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.out.println("--unsupported-- (exception msg: '" + ex.getMessage() + "')");
        }
        try {
            System.out.print("Processor         :  ");
            System.out.println(SystemInfo.getProcessor());
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.out.println("--unsupported-- (exception msg: '" + ex.getMessage() + "')");
        }
        try {
            System.out.print("Hardware          :  ");
            System.out.println(SystemInfo.getHardware());
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.out.println("--unsupported-- (exception msg: '" + ex.getMessage() + "')");
        }
        try {
            System.out.print("Hardware Revision :  ");
            System.out.println(SystemInfo.getRevision());
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.out.println("--unsupported-- (exception msg: '" + ex.getMessage() + "')");
        }
        try {
            System.out.println("Is Hard Float ABI :  " + SystemInfo.isHardFloatAbi());
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.out.println("--unsupported-- (exception msg: '" + ex.getMessage() + "')");
        }
        try {
            System.out.print("Board Type        :  ");
            System.out.println(SystemInfo.getBoardType().name());
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.out.println("--unsupported-- (exception msg: '" + ex.getMessage() + "')");
        }

        System.out.println("----------------------------------------------------");
        System.out.println("MEMORY INFO");
        System.out.println("----------------------------------------------------");
        try {
            System.out.print("Total Memory      :  ");
            System.out.println(SystemInfo.getMemoryTotal());
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.out.println("--unsupported-- (exception msg: '" + ex.getMessage() + "')");
        }
        try {
            System.out.print("Used Memory       :  ");
            System.out.println(SystemInfo.getMemoryUsed());
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.out.println("--unsupported-- (exception msg: '" + ex.getMessage() + "')");
        }
        try {
            System.out.print("Free Memory       :  ");
            System.out.println(SystemInfo.getMemoryFree());
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.out.println("--unsupported-- (exception msg: '" + ex.getMessage() + "')");

        }
        try {
            System.out.print("Shared Memory     :  ");
            System.out.println(SystemInfo.getMemoryShared());
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.out.println("--unsupported-- (exception msg: '" + ex.getMessage() + "')");
        }
        try {
            System.out.print("Memory Buffers    :  ");
            System.out.println(SystemInfo.getMemoryBuffers());
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.out.println("--unsupported-- (exception msg: '" + ex.getMessage() + "')");
        }
        try {
            System.out.print("Cached Memory     :  ");
            System.out.println(SystemInfo.getMemoryCached());
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.out.println("--unsupported-- (exception msg: '" + ex.getMessage() + "')");
        }

        System.out.println("----------------------------------------------------");
        System.out.println("OPERATING SYSTEM INFO");
        System.out.println("----------------------------------------------------");
        try {
            System.out.print("OS Name           :  ");
            System.out.println(SystemInfo.getOsName());
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.out.println("--unsupported-- (exception msg: '" + ex.getMessage() + "')");
        }
        try {
            System.out.print("OS Version        :  ");
            System.out.println(SystemInfo.getOsVersion());
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.out.println("--unsupported-- (exception msg: '" + ex.getMessage() + "')");
        }
        try {
            System.out.print("OS Architecture   :  ");
            System.out.println(SystemInfo.getOsArch());
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.out.println("--unsupported-- (exception msg: '" + ex.getMessage() + "')");
        }
        try {
            System.out.print("OS Firmware Build :  ");
            System.out.println(SystemInfo.getOsFirmwareBuild());
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.out.println("--unsupported-- (exception msg: '" + ex.getMessage() + "')");
        }
        try {
            System.out.print("OS Firmware Date  :  ");
            System.out.println(SystemInfo.getOsFirmwareDate());
        } catch (UnsupportedOperationException ex) {
            //ex.printStackTrace();
            System.out.println("--unsupported-- (exception msg: '" + ex.getMessage() + "')");
        }

        System.out.println("----------------------------------------------------");
        System.out.println("JAVA ENVIRONMENT INFO");
        System.out.println("----------------------------------------------------");
        System.out.println("Java Vendor       :  " + SystemInfo.getJavaVendor());
        System.out.println("Java Vendor URL   :  " + SystemInfo.getJavaVendorUrl());
        System.out.println("Java Version      :  " + SystemInfo.getJavaVersion());
        System.out.println("Java VM           :  " + SystemInfo.getJavaVirtualMachine());
        System.out.println("Java Runtime      :  " + SystemInfo.getJavaRuntime());

        System.out.println("----------------------------------------------------");
        System.out.println("NETWORK INFO");
        System.out.println("----------------------------------------------------");

        // display some of the network information
        System.out.println("Hostname          :  " + NetworkInfo.getHostname());
        for (String ipAddress : NetworkInfo.getIPAddresses())
            System.out.println("IP Addresses      :  " + ipAddress);
        for (String fqdn : NetworkInfo.getFQDNs())
            System.out.println("FQDN              :  " + fqdn);
        for (String nameserver : NetworkInfo.getNameservers())
            System.out.println("Nameserver        :  " + nameserver);

        System.out.println();
    }
}