package com.apicloud.uzble;

import java.util.Map;
import java.util.UUID;
import com.uzmap.pkg.uzcore.uzmodule.UZModuleContext;

public interface IBle {
	public void scan(UUID[] uuids);

	public Map<String, BleDeviceInfo> getPeripheral();

	public boolean isScanning();

	public void stopScan();

	public void connect(UZModuleContext moduleContext, String address);

	public void disconnect(UZModuleContext moduleContext, String address);

	public boolean isConnected(String address);

	public void discoverService(UZModuleContext moduleContext, String address);

	public void discoverCharacteristics(UZModuleContext moduleContext,
			String address, String serviceUUID);

	public void discoverDescriptorsForCharacteristic(
			UZModuleContext moduleContext, String address, String serviceUUID,
			String characteristicUUID);

	public void setNotify(UZModuleContext moduleContext, String address,
			String serviceUUID, String characteristicUUID);

	public void readValueForCharacteristic(UZModuleContext moduleContext,
			String address, String serviceUUID, String characteristicUUID);

	public void readValueForDescriptor(UZModuleContext moduleContext,
			String address, String serviceUUID, String characteristicUUID,
			String descriptorUUID);

	public void writeValueForCharacteristic(UZModuleContext moduleContext,
			String address, String serviceUUID, String characteristicUUID,
			String value);

	public void writeValueForDescriptor(UZModuleContext moduleContext,
			String address, String serviceUUID, String characteristicUUID,
			String descriptorUUID, String value);

}
