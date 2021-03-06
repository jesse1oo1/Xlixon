package net.minecraft.src.ic2.api;

import java.util.List;

/**
 * Tile entities which want to synchronized specific fields between client and server have to implement this.
 * 
 * The fields don't update themselves, a field update must be sent every time a synchronized field changes.
 */
public interface INetworkDataProvider {
	/**
	 * Get the list of synchronized fields.
	 * 
	 * @return Names of the synchronized fields
	 */
	List<String> getNetworkedFields();
}

