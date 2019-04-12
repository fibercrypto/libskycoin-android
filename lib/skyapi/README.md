# skyapi

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>Skycoin</groupId>
    <artifactId>skyapi</artifactId>
    <version>v0.25.1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "Skycoin:skyapi:v0.25.1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/skyapi-v0.25.1.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import skycoin.DefaultApi;

public class DefaultApiExample {

    public static void main(String[] args) {
        DefaultApi apiInstance = new DefaultApi();
        try {
            Object result = apiInstance.addressCount();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#addressCount");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://127.0.0.1:6420*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**addressCount**](docs/DefaultApi.md#addressCount) | **GET** /api/v1/addresscount | Returns the total number of unique address that have coins.
*DefaultApi* | [**addressUxouts**](docs/DefaultApi.md#addressUxouts) | **GET** /api/v1/address_uxouts | 
*DefaultApi* | [**balanceGet**](docs/DefaultApi.md#balanceGet) | **GET** /api/v1/balance | Returns the balance of one or more addresses, both confirmed and predicted. The predicted balance is the confirmed balance minus the pending spends.
*DefaultApi* | [**balancePost**](docs/DefaultApi.md#balancePost) | **POST** /api/v1/balance | Returns the balance of one or more addresses, both confirmed and predicted. The predicted balance is the confirmed balance minus the pending spends.
*DefaultApi* | [**block**](docs/DefaultApi.md#block) | **GET** /api/v1/block | 
*DefaultApi* | [**blockchainMetadata**](docs/DefaultApi.md#blockchainMetadata) | **GET** /api/v1/blockchain/metadata | Returns the blockchain metadata.
*DefaultApi* | [**blockchainProgress**](docs/DefaultApi.md#blockchainProgress) | **GET** /api/v1/blockchain/progress | Returns the blockchain sync progress.
*DefaultApi* | [**blocksGet**](docs/DefaultApi.md#blocksGet) | **GET** /api/v1/blocks | blocksHandler returns blocks between a start and end point,
*DefaultApi* | [**blocksPost**](docs/DefaultApi.md#blocksPost) | **POST** /api/v1/blocks | blocksHandler returns blocks between a start and end point,
*DefaultApi* | [**coinSupply**](docs/DefaultApi.md#coinSupply) | **GET** /api/v1/coinSupply | 
*DefaultApi* | [**csrf**](docs/DefaultApi.md#csrf) | **GET** /api/v1/csrf | Creates a new CSRF token. Previous CSRF tokens are invalidated by this call.
*DefaultApi* | [**defaultConnections**](docs/DefaultApi.md#defaultConnections) | **GET** /api/v1/network/defaultConnections | defaultConnectionsHandler returns the list of default hardcoded bootstrap addresses.\\n They are not necessarily connected to.
*DefaultApi* | [**explorerAddress**](docs/DefaultApi.md#explorerAddress) | **GET** /api/v1/explorer/address | 
*DefaultApi* | [**health**](docs/DefaultApi.md#health) | **GET** /api/v1/health | Returns node health data.
*DefaultApi* | [**lastBlocks**](docs/DefaultApi.md#lastBlocks) | **GET** /api/v1/last_blocks | 
*DefaultApi* | [**networkConnection**](docs/DefaultApi.md#networkConnection) | **GET** /api/v1/network/connection | This endpoint returns a specific connection.
*DefaultApi* | [**networkConnections**](docs/DefaultApi.md#networkConnections) | **GET** /api/v1/network/connections | This endpoint returns all outgoings connections.
*DefaultApi* | [**networkConnectionsDisconnect**](docs/DefaultApi.md#networkConnectionsDisconnect) | **POST** /api/v1/network/connection/disconnect | 
*DefaultApi* | [**networkConnectionsExchange**](docs/DefaultApi.md#networkConnectionsExchange) | **GET** /api/v1/network/connections/exchange | 
*DefaultApi* | [**networkConnectionsTrust**](docs/DefaultApi.md#networkConnectionsTrust) | **GET** /api/v1/network/connections/trust | trustConnectionsHandler returns all trusted connections.\\n They are not necessarily connected to. In the default configuration, these will be a subset of the default hardcoded bootstrap addresses.
*DefaultApi* | [**outputsGet**](docs/DefaultApi.md#outputsGet) | **GET** /api/v1/outputs | If neither addrs nor hashes are specificed, return all unspent outputs. If only one filter is specified, then return outputs match the filter. Both filters cannot be specified.
*DefaultApi* | [**outputsPost**](docs/DefaultApi.md#outputsPost) | **POST** /api/v1/outputs | If neither addrs nor hashes are specificed, return all unspent outputs. If only one filter is specified, then return outputs match the filter. Both filters cannot be specified.
*DefaultApi* | [**pendingTxs**](docs/DefaultApi.md#pendingTxs) | **GET** /api/v1/pendingTxs | 
*DefaultApi* | [**resendUnconfirmedTxns**](docs/DefaultApi.md#resendUnconfirmedTxns) | **POST** /api/v1/resendUnconfirmedTxns | 
*DefaultApi* | [**richlist**](docs/DefaultApi.md#richlist) | **GET** /api/v1/richlist | Returns the top skycoin holders.
*DefaultApi* | [**transaction**](docs/DefaultApi.md#transaction) | **GET** /api/v1/transaction | 
*DefaultApi* | [**transactionInject**](docs/DefaultApi.md#transactionInject) | **POST** /api/v2/transaction/inject | Broadcast a hex-encoded, serialized transaction to the network.
*DefaultApi* | [**transactionRaw**](docs/DefaultApi.md#transactionRaw) | **GET** /api/v2/transaction/raw | Returns the hex-encoded byte serialization of a transaction. The transaction may be confirmed or unconfirmed.
*DefaultApi* | [**transactionVerify**](docs/DefaultApi.md#transactionVerify) | **POST** /api/v2/transaction/verify | 
*DefaultApi* | [**transactionsGet**](docs/DefaultApi.md#transactionsGet) | **GET** /api/v1/transactions | Returns transactions that match the filters.
*DefaultApi* | [**transactionsPost**](docs/DefaultApi.md#transactionsPost) | **POST** /api/v1/transactions | Returns transactions that match the filters.
*DefaultApi* | [**uxout**](docs/DefaultApi.md#uxout) | **GET** /api/v1/uxout | Returns an unspent output by ID.
*DefaultApi* | [**verifyAddress**](docs/DefaultApi.md#verifyAddress) | **POST** /api/v2/address/verify | Verifies a Skycoin address.
*DefaultApi* | [**version**](docs/DefaultApi.md#version) | **GET** /api/v1/version | 
*DefaultApi* | [**wallet**](docs/DefaultApi.md#wallet) | **GET** /api/v1/wallet | Returns a wallet by id.
*DefaultApi* | [**walletBalance**](docs/DefaultApi.md#walletBalance) | **GET** /api/v1/wallet/balance | Returns the wallet&#39;s balance, both confirmed and predicted.  The predicted balance is the confirmed balance minus the pending spends.
*DefaultApi* | [**walletCreate**](docs/DefaultApi.md#walletCreate) | **POST** /api/v1/wallet/create | 
*DefaultApi* | [**walletDecrypt**](docs/DefaultApi.md#walletDecrypt) | **POST** /api/v1/wallet/decrypt | Decrypts wallet.
*DefaultApi* | [**walletEncrypt**](docs/DefaultApi.md#walletEncrypt) | **POST** /api/v1/wallet/encrypt | Encrypt wallet.
*DefaultApi* | [**walletFolder**](docs/DefaultApi.md#walletFolder) | **GET** /api/v1/wallets/folderName | 
*DefaultApi* | [**walletNewAddress**](docs/DefaultApi.md#walletNewAddress) | **POST** /api/v1/wallet/newAddress | 
*DefaultApi* | [**walletNewSeed**](docs/DefaultApi.md#walletNewSeed) | **GET** /api/v1/wallet/newSeed | 
*DefaultApi* | [**walletRecover**](docs/DefaultApi.md#walletRecover) | **POST** /api/v2/wallet/recover | Recovers an encrypted wallet by providing the seed. The first address will be generated from seed and compared to the first address of the specified wallet. If they match, the wallet will be regenerated with an optional password. If the wallet is not encrypted, an error is returned.
*DefaultApi* | [**walletSeed**](docs/DefaultApi.md#walletSeed) | **POST** /api/v1/wallet/seed | This endpoint only works for encrypted wallets. If the wallet is unencrypted, The seed will be not returned.
*DefaultApi* | [**walletSeedVerify**](docs/DefaultApi.md#walletSeedVerify) | **POST** /api/v2/wallet/seed/verify | Verifies a wallet seed.
*DefaultApi* | [**walletSpent**](docs/DefaultApi.md#walletSpent) | **POST** /api/v1/wallet/spend | 
*DefaultApi* | [**walletTransaction**](docs/DefaultApi.md#walletTransaction) | **POST** /api/v1/wallet/transaction | 
*DefaultApi* | [**walletTransactions**](docs/DefaultApi.md#walletTransactions) | **GET** /api/v1/wallet/transactions | 
*DefaultApi* | [**walletUnload**](docs/DefaultApi.md#walletUnload) | **POST** /api/v1/wallet/unload | Unloads wallet from the wallet service.
*DefaultApi* | [**walletUpdate**](docs/DefaultApi.md#walletUpdate) | **POST** /api/v1/wallet/update | Update the wallet.
*DefaultApi* | [**wallets**](docs/DefaultApi.md#wallets) | **GET** /api/v1/wallets | 


## Documentation for Models

 - [Apiv1exploreraddressInputs](docs/Apiv1exploreraddressInputs.md)
 - [Apiv1exploreraddressOutputs](docs/Apiv1exploreraddressOutputs.md)
 - [Apiv1exploreraddressStatus](docs/Apiv1exploreraddressStatus.md)
 - [Apiv1pendingTxsTransaction](docs/Apiv1pendingTxsTransaction.md)
 - [Apiv1walletsEntries](docs/Apiv1walletsEntries.md)
 - [Apiv1walletsMeta](docs/Apiv1walletsMeta.md)
 - [Apiv1wallettransactionHoursSelection](docs/Apiv1wallettransactionHoursSelection.md)
 - [Apiv1wallettransactionTo](docs/Apiv1wallettransactionTo.md)
 - [Apiv1wallettransactionWallet](docs/Apiv1wallettransactionWallet.md)
 - [InlineObject](docs/InlineObject.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2003UnconfirmedVerifyTransaction](docs/InlineResponse2003UnconfirmedVerifyTransaction.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [InlineResponse2006](docs/InlineResponse2006.md)
 - [InlineResponse2007](docs/InlineResponse2007.md)
 - [InlineResponse2007Data](docs/InlineResponse2007Data.md)
 - [InlineResponseDefault](docs/InlineResponseDefault.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### csrfAuth

- **Type**: API key
- **API key parameter name**: X-CSRF-TOKEN
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

skycoin.doe@example.com

