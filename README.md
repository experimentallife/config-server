# Config Server

*Run*
```sh
./gradlew bootRun
```

*example*

```sh
http://localhost:8080/league-of-legends-api/development
```

*Result*

```json
{
    "name":"league-of-legends-api",
    "profiles":["development"],
    "label":null,
    "version":"b2dfcec7a2e376b68958ddf86e71ff5ee5c963c1",
    "state":null,
    "propertySources":[
        {
            "name":"https://github.com/experimentallife/config-k8s/league-of-legends-api-development.yml",
            "source":{
                "scope":"development",
                "name":"league of legends api",
                "version":0.1,
                "baseDataUri":"https://opendata.nederlandwereldwijd.nl/v1/sources/nederlandwereldwijd/infotypes/traveladvice",
                "fetchInterval":"00:05:00"
            }
        },
        {
            "name":"https://github.com/experimentallife/config-k8s/league-of-legends-api.yml",
            "source":{
                "scope":"production",
                "name":"league of legends api",
                "version":0.1,
                "baseDataUri":"https://opendata.nederlandwereldwijd.nl/v1/sources/nederlandwereldwijd/infotypes/traveladvice",
                "fetchInterval":"00:05:00"
            }
        }
    ]
}
```