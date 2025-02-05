package com.bitcoinvisualizer;

import java.util.List;

import javax.jdo.annotations.Element;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable = "true")
public class TransactionType
{
	@Persistent
	private BlockType blockType;

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

	@Persistent
	private String hash;

	@Persistent
	private int version;

	@Persistent
	private int vin_sz;

	@Persistent
	private int vout_sz;

	@Persistent
	private int lock_time;

	@Persistent
	private long size;

	@Persistent(mappedBy = "transactionType")
	@Element(dependent = "true") 
	// @NotPersistent
	private List<IncomingAddressType> incoming_address;

	@Persistent(mappedBy = "transactionType")
	@Element(dependent = "true")
	// @NotPersistent 
	private List<OutgoingAddressType> outgoing_address;

	public TransactionType()
	{

	}

	public TransactionType(String hash, int version, int vin_sz, int vout_sz, int lock_time, long size, List<IncomingAddressType> incoming_address,
			List<OutgoingAddressType> outgoing_address)
	{
		this.hash = hash;
		this.version = version;
		this.vin_sz = vin_sz;
		this.vout_sz = vout_sz;
		this.lock_time = lock_time;
		this.size = size;
		this.incoming_address = incoming_address;
		this.outgoing_address = outgoing_address;
	}

	public Key getKey()
	{
		return key;
	}

	public void setKey(Key key)
	{
		this.key = key;
	}

	/**
	 * 
	 * @return The full hash of this transaction.
	 */
	public String getHash()
	{
		return hash;
	}

	/**
	 * 
	 * @param hash
	 *            The full hash of this transaction.
	 */
	public void setHash(String hash)
	{
		this.hash = hash;
	}

	public int getVersion()
	{
		return version;
	}

	public void setVersion(int version)
	{
		this.version = version;
	}

	/**
	 * 
	 * @return The number of incoming transactions
	 */
	public int getVin_sz()
	{
		return vin_sz;
	}

	/**
	 * 
	 * @param vin_sz
	 *            The number of outgoing transactions
	 */
	public void setVin_sz(int vin_sz)
	{
		this.vin_sz = vin_sz;
	}

	/**
	 * 
	 * @return The number of incoming transactions
	 */
	public int getVout_sz()
	{
		return vout_sz;
	}

	/**
	 * 
	 * @param vout_sz
	 *            The number of outgoing transactions
	 */
	public void setVout_sz(int vout_sz)
	{
		this.vout_sz = vout_sz;
	}

	/**
	 * I dont know what this is...
	 * 
	 * @return
	 */
	public int getLock_time()
	{
		return lock_time;
	}

	/**
	 * I dont know what this is...
	 * 
	 * @param lock_time
	 */
	public void setLock_time(int lock_time)
	{
		this.lock_time = lock_time;
	}

	/**
	 * 
	 * @return The data size of this transaction. This is the number that
	 *         Bitcoin uses for block size limits and fees -- it may not be the
	 *         actual size on disk. 1 kilobyte = 1000 bytes (this is how Bitcoin
	 *         does it).
	 */
	public long getSize()
	{
		return size;
	}

	/**
	 * 
	 * @param size
	 *            The data size of this transaction. This is the number that
	 *            Bitcoin uses for block size limits and fees -- it may not be
	 *            the actual size on disk. 1 kilobyte = 1000 bytes (this is how
	 *            Bitcoin does it).
	 */
	public void setSize(long size)
	{
		this.size = size;
	}

	/**
	 * 
	 * @return The list containing the incoming addresses associated with this
	 *         block.
	 */
	public List<IncomingAddressType> getIncoming_address()
	{
		return incoming_address;
	}

	/**
	 * 
	 * @param incoming_address
	 *            The list containing the incoming addresses associated with
	 *            this block.
	 */
	public void setIncoming_address(List<IncomingAddressType> incoming_address)
	{
		this.incoming_address = incoming_address;
	}

	/**
	 * 
	 * @return The list containing the outgoing addresses associated with this
	 *         block.
	 */
	public List<OutgoingAddressType> getOutgoing_address()
	{
		return outgoing_address;
	}

	/**
	 * 
	 * @param outgoing_address
	 *            The list containing the outgoing addresses associated with
	 *            this block.
	 */
	public void setOutgoing_address(List<OutgoingAddressType> outgoing_address)
	{
		this.outgoing_address = outgoing_address;
	}
	
	/**
	 * Returns the parent this transaction belongs to
	 * @return
	 */
	public BlockType getBlockType()
	{
		return blockType;
	}

	/** 
	 * 
	 * @param blockType The parent this transaction belongs to
	 */
	public void setBlockType(BlockType blockType)
	{
		this.blockType = blockType;
	}

}
