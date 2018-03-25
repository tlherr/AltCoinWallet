# BlockHack2018

[![Build Status](https://travis-ci.org/tlherr/AltCoinWallet.svg?branch=master)](https://travis-ci.org/tlherr/AltCoinWallet)

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

##### Possible starting point

https://github.com/bitcoinj/bitcoinj

##### CLAMD info 

Clam version v1.4.17-135-gac5c8cc

Usage:
  Clamd [options]
  Clamd [options] <command> [params]  Send command to -server or Clamd
  Clamd [options] help                List commands
  Clamd [options] help <command>      Get help for a command

Options:
  -?                     This help message
  -conf=<file>           Specify configuration file (default: clam.conf)
  -pid=<file>            Specify pid file (default: clamd.pid)
  -datadir=<dir>         Specify data directory
  -wallet=<file>         Specify wallet file within data directory (default: wallet.dat
  -dbcache=<n>           Set database cache size in megabytes (default: 25)
  -dblogsize=<n>         Set database disk log size in megabytes (default: 100)
  -timeout=<n>           Specify connection timeout in milliseconds (default: 5000)
  -proxy=<ip:port>       Connect through socks proxy
  -socks=<n>             Select the version of socks proxy to use (4-5, default: 5)
  -tor=<ip:port>         Use proxy to reach tor hidden services (default: same as -proxy)
  -dns                   Allow DNS lookups for -addnode, -seednode and -connect
  -port=<port>           Listen for connections on <port> (default: 31174 or testnet: 35714)
  -maxconnections=<n>    Maintain at most <n> connections to peers (default: 125)
  -addnode=<ip>          Add a node to connect to and attempt to keep the connection open
  -connect=<ip>          Connect only to the specified node(s)
  -seednode=<ip>         Connect to a node to retrieve peer addresses, and disconnect
  -externalip=<ip>       Specify your own public address
  -onlynet=<net>         Only connect to nodes in network <net> (IPv4, IPv6 or Tor)
  -discover              Discover own IP address (default: 1 when listening and no -externalip)
  -listen                Accept connections from outside (default: 1 if no -proxy or -connect)
  -bind=<addr>           Bind to given address. Use [host]:port notation for IPv6
  -dnsseed               Query for peer addresses via DNS lookup, if low on addresses (default: 1 unless -connect)
  -forcednsseed          Always query for peer addresses via DNS lookup (default: 0)
  -synctime              Sync time with other nodes. Disable if time on your system is precise e.g. syncing with NTP (default: 1)
  -cppolicy              Sync checkpoints policy (default: strict)
  -banscore=<n>          Threshold for disconnecting misbehaving peers (default: 100)
  -bantime=<n>           Number of seconds to keep misbehaving peers from reconnecting (default: 86400)
  -maxreceivebuffer=<n>  Maximum per-connection receive buffer, <n>*1000 bytes (default: 5000)
  -maxsendbuffer=<n>     Maximum per-connection send buffer, <n>*1000 bytes (default: 1000)
  -paytxfee=<amt>        Fee per KB to add to transactions you send
  -mininput=<amt>        When creating transactions, ignore inputs with value less than this (default: 0.00)
  -testnet               Use the test network
  -debug=<category>      Output debugging information (default: 0, supplying <category> is optional)
If <category> is not supplied, output all debugging information.
<category> can be: addrman, alert, db, lock, rand, rpc, selectcoins, mempool, net, coinage, coinstake, creation, stakemodifier.
  -logtimestamps         Prepend debug output with timestamp
  -shrinkdebugfile       Shrink debug.log file on client startup (default: 1 when no -debug)
  -printtoconsole        Send trace/debug info to console instead of debug.log file
  -regtest               Enter regression test mode, which uses a special chain in which blocks can be solved instantly. This is intended for regression testing tools and app development.
  -rpcuser=<user>        Username for JSON-RPC connections
  -rpcpassword=<pw>      Password for JSON-RPC connections
  -rpcport=<port>        Listen for JSON-RPC connections on <port> (default: 30174 or testnet: 35715)
  -rpcallowip=<ip>       Allow JSON-RPC connections from specified IP address
  -rpcconnect=<ip>       Send commands to node running on <ip> (default: 127.0.0.1)
  -rpcwait               Wait for RPC server to start
  -rpcthreads=<n>        Set the number of threads to service RPC calls (default: 4)
  -clamspeech=off        Set clamspeech=off to turn off random clamspeech quotes in outgoing transactions
  -clamstake=off         Set clamstake=off to turn off random clamspeech quotes when staking
  -blocknotify=<cmd>     Execute command when the best block changes (%s in cmd is replaced by block hash)
  -walletnotify=<cmd>    Execute command when a wallet transaction changes (%s in cmd is replaced by TxID)
  -stakenotify=<cmd>     Execute command each time we stake a block
                         (%r in cmd is replaced by the block reward,
                          %a in cmd is replaced by the address which staked,
                          %t in cmd is replaced by the total amount staked by this wallet, and
                          %s in cmd is replaced by the total amount staked by the address which just staked)
  -staketo=<addr>        Address to move coins to as they stake
  -rewardto=<addr>       Address to credit with just the reward from staking a block
  -change=<addr>         Address to send change to
  -spendlast=<addr>      Avoid spending outputs from given address(es) if possible
  -stake=<addr>          Stake only outputs at the specified address(es)
  -confchange            Require a confirmations for change (default: 0)
  -minimizecoinage       Minimize weight consumption (experimental) (default: 0)
  -alertnotify=<cmd>     Execute command when a relevant alert is received (%s in cmd is replaced by message)
  -upgradewallet         Upgrade wallet to latest format
  -keypool=<n>           Set key pool size to <n> (default: 100)
  -rescan                Rescan the block chain for missing wallet transactions
  -reindex               Forces a reindex of the block DB and tx DB
  -salvagewallet         Attempt to recover private keys from a corrupt wallet.dat
  -checkblocks=<n>       How many blocks to check at startup (default: 500, 0 = all)
  -checklevel=<n>        How thorough the block verification is (0-6, default: 1)
  -loadblock=<file>      Imports blocks from external blk000?.dat file
  -maxorphanblocks=<n>   Keep at most <n> unconnectable blocks in memory (default: 750)

Block creation options:
  -blockminsize=<n>      Set minimum block size in bytes (default: 0)
  -blockmaxsize=<n>      Set maximum block size in bytes (default: 250000)
  -blockprioritysize=<n> Set maximum size of high-priority/low-fee transactions in bytes (default: 27000)

SSL options: (see the Bitcoin Wiki for SSL setup instructions)
  -rpcssl                                  Use OpenSSL (https) for JSON-RPC connections
  -rpcsslcertificatechainfile=<file.cert>  Server certificate file (default: server.cert)
  -rpcsslprivatekeyfile=<file.pem>         Server private key (default: server.pem)
  -rpcsslciphers=<ciphers>                 Acceptable ciphers (default: TLSv1.2+HIGH:TLSv1+HIGH:!SSLv2:!aNULL:!eNULL:!3DES:@STRENGTH)