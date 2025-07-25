# 🗺️ MapsAllInOne

MapsAllInOne is a comprehensive Android application that showcases various location-based features using Google Maps and Location Services APIs. This project is built using **MVVM architecture** and follows **Clean Code principles**, making it scalable and easy to maintain.

---

## 🚀 Features

- 🌐 Display current location using Google Fused Location Provider
- 📍 Add and manage markers
- 🔄 Real-time location updates
- 🧭 Compass direction and movement tracking
- 🔍 Search locations with auto-complete suggestions
- 🗺️ Map types: Normal, Satellite, Terrain, Hybrid
- 🔀 Route drawing between two points
- 📏 Distance calculator between two coordinates
- 📡 GPS enable/disable check
- 🧩 Modular architecture with support for multiple map components

---

## 📱 Screenshots

| Home | Search | Route |
|------|--------|-------|
| ![home](screenshots/home.png) | ![search](screenshots/search.png) | ![route](screenshots/route.png) |

---

## 🏗️ Architecture

The app follows the **MVVM (Model-View-ViewModel)** architecture, utilizing key Android Jetpack components and modern practices.


---

## 🧰 Tech Stack

- **Language**: Kotlin
- **Architecture**: MVVM + Clean Code
- **UI**: Jetpack Compose / XML
- **Dependency Injection**: Dagger-Hilt
- **Asynchronous**: Coroutines
- **Location Services**: Google Fused Location Provider
- **Map SDK**: Google Maps SDK
- **Permissions**: Accompanist + Jetpack APIs
- **Navigation**: Navigation Component
- **Testing**: JUnit, Mockk

---

## 🛠️ Setup Instructions

1. **Clone the repo**
   ```bash
   git clone https://github.com/yourusername/MapsAllInOne.git
   cd MapsAllInOne
2 Open in Android Studio

3 Set up your Google Maps API key
 - Get an API key from Google Cloud Console
 - Add it to your local.properties:

## 🔐 Permissions
MapsAllInOne requires the following permissions:

- ACCESS_FINE_LOCATION
- ACCESS_COARSE_LOCATION
- INTERNET
Ensure permissions are granted and handled using modern APIs (Accompanist/Jetpack Compose or Activity Result APIs).

## 📂 Module Structure
MapsAllInOne/
│
├── app/                 # Main app module
│   ├── di/              # Dagger-Hilt modules
│   ├── ui/              # UI components
│   ├── viewmodel/       # ViewModels
│   ├── repository/      # Repositories
│   ├── model/           # Data models
│   └── utils/           # Utility and helper classes

## 🤝 Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

##👨‍💻 Author
🌐 [LinkedIn](https://www.linkedin.com/in/myofficework/)

