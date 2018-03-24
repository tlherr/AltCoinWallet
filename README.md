# BlockHack2018

## Alt Coin Wallet

Alt Coin Wallet
New alternative crypto currencies “alt coins” are being created each day, but many
are difficult to use because their ecosystem lacks a centralized “wallet” payment infrastructure. 
We are involved with creating a proof of concept coin called “CLAM coins”. The goal is to interact with an CLAM
coin blockchain to create an open source wallet accessible by API calls.

### What’s provided?

A server running the CLAM coin blockchain

The commands used to access the alt coin blockchain

### What’s required?

* The ability to write code in a common language such as JavaScript, Nodejs, Java, etc
* Create code that will access the server and return information from the blockchain
* Focus on specific actions such as address creation, balance query, making payments
* BONUS: Add support for other “alt coins” such as PIVX

### Examples

* https://www.blockcypher.com/dev/bitcoin/
* https://blockchain.info/api/blockchain_wallet_api

### Uses

* Create a blockchain explorer for a particular alt coin
* Develop a wallet app or external APIs that users can access
* Implement a payment gateway that allows users integrate this alt coin to their own project

#### What is a wallet

A Bitcoin wallet is a collection of private keys but may also refer to client software used to manage those keys and to make transactions on the Bitcoin network. 

#### Types of wallets

##### Deterministic

###### Type 1 deterministic wallet

A type 1 deterministic wallet is a simple method of generating addresses from a known starting string, as such it does not allow 
advanced features such as a Master Public Key. To generate a private key take SHA256(string + n), where n is an ASCII-coded number that starts from 1 
and increments as additional keys are needed.

This type of wallet can be created by Casascius Bitcoin Address Utility.

###### Type 2 hierarchical deterministic wallet

This wallet type is described in BIP 0032 and is fully implemented in TREZOR, Electrum and CarbonWallet. 
The seed is a random 128 bit value presented to the user as a 12 word mnemonic using common English words. The seed is used after 100,000 rounds of SHA256 to slow down attacks against weak user-chosen strings.

The initial description and workings of this wallet type is credited to Gregory Maxwell.

###### Armory deterministic wallet

Armory has its own Type-2 deterministic wallet format based on a "root key" and a "chain code." 
Earlier versions of Armory required backing up both the "root key" and "chaincode," while newer versions start deriving the 
chaincode from the private key in a non-reversible way. These newer Armory wallets (0.89+) only require the single, 256-bit root key. 
This older format is intended to be phased out in favor of the standard BIP0032 format.

###### Possible starting point

https://github.com/bitcoinj/bitcoinj