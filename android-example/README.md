Ejemplo de integración de `dados.json` desde GitHub en Android Studio

Pasos resumidos:

- Añadir permiso en `AndroidManifest.xml`:

  <uses-permission android:name="android.permission.INTERNET" />

- Agregar dependencias en el `module` `build.gradle` (app):

  implementation 'com.squareup.retrofit2:retrofit:2.9.0'
  implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
  implementation 'com.squareup.okhttp3:logging-interceptor:4.9.3'

- Código de ejemplo dentro del paquete `com.example.dados`.

Archivos incluidos en este ejemplo:

- `android-example/src/main/java/com/example/dados/Models.kt`
- `android-example/src/main/java/com/example/dados/DadosApi.kt`
- `android-example/src/main/java/com/example/dados/RetrofitClient.kt`
- `android-example/src/main/java/com/example/dados/MainActivity.kt`

Instrucciones rápidas:

1. Copia los archivos en tu módulo `app/src/main/java/...` manteniendo el paquete `com.example.dados`.
2. Añade las dependencias y el permiso. 3. Sincroniza y ejecuta la app.

Raw URL usado en el ejemplo:

https://raw.githubusercontent.com/Ara20066/dados/main/dados.json
