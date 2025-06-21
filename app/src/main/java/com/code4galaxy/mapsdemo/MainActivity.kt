package com.code4galaxy.mapsdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.code4galaxy.mapsdemo.databinding.ActivityMainBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*

class MainActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val lat = intent.getDoubleExtra("lat", 25.28)
        val lng = intent.getDoubleExtra("lng", 51.53)
        val location = LatLng(lat, lng)

        mMap.addMarker(MarkerOptions().position(location).title("Marker where u are"))
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location, 15f))

        with(binding) {
            btnMapTypeNormal.setOnClickListener {
                mMap.mapType = GoogleMap.MAP_TYPE_NORMAL
            }

            btnMapTypeSattelite.setOnClickListener {
                mMap.mapType = GoogleMap.MAP_TYPE_SATELLITE
            }

            btnMapTypeHybrid.setOnClickListener {
                mMap.mapType = GoogleMap.MAP_TYPE_HYBRID
            }

            btnMapTypeTerrian.setOnClickListener {
                mMap.mapType = GoogleMap.MAP_TYPE_TERRAIN
            }

            btnCircle.setOnClickListener {
                mMap.clear()
                mMap.addCircle(
                    CircleOptions()
                        .center(location)
                        .radius(500.0) // in meters
                        .strokeColor(0xFFFF0000.toInt())
                        .fillColor(0x44FF0000)
                        .strokeWidth(5f)
                )
                mMap.addMarker(MarkerOptions().position(location).title("Circle Center"))
            }

            btnPolyline.setOnClickListener {
                mMap.clear()
                val point1 = location
                val point2 = LatLng(lat + 0.01, lng + 0.01)
                val point3 = LatLng(lat + 0.02, lng)
                mMap.addPolyline(
                    PolylineOptions()
                        .add(point1, point2, point3)
                        .color(0xFF0000FF.toInt())
                        .width(10f)
                )
            }

            btnPolygon.setOnClickListener {
                mMap.clear()
                val p1 = LatLng(lat + 0.01, lng)
                val p2 = LatLng(lat + 0.02, lng + 0.01)
                val p3 = LatLng(lat + 0.01, lng + 0.02)
                val p4 = LatLng(lat, lng + 0.01)

                mMap.addPolygon(
                    PolygonOptions()
                        .add(p1, p2, p3, p4)
                        .strokeColor(0xFF00FF00.toInt())
                        .fillColor(0x4400FF00)
                        .strokeWidth(6f)
                )
            }
        }
    }
}
