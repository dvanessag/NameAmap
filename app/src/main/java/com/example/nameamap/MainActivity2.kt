package com.example.nameamap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.esri.arcgisruntime.ArcGISRuntimeEnvironment
import com.esri.arcgisruntime.mapping.ArcGISMap
import com.esri.arcgisruntime.mapping.BasemapStyle
import com.esri.arcgisruntime.mapping.Viewpoint
import com.esri.arcgisruntime.mapping.view.MapView

import com.example.nameamap.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity(R.layout.activity_main2) {

    private val activityMain2Binding by lazy {
        ActivityMain2Binding.inflate(layoutInflater)
    }
    private val mapView : MapView by lazy {
        activityMain2Binding.mapView
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activityMain2Binding.root)

        setApiKeyForApp()

        setupMap()
    }

    // set up your map here. You will call this method from onCreate()
    private fun setupMap() {

        // create a map with the BasemapStyle streets
        val map = ArcGISMap(BasemapStyle.ARCGIS_NAVIGATION)

        // set the map to be displayed in the layout's MapView
        mapView.map = map

        // set the viewpoint, Viewpoint(latitude, longitude, scale)
        mapView.setViewpoint(Viewpoint(-36.873450, 174.766841, 720000.0))
    }

    override fun onPause() {
        mapView.pause()
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
        mapView.resume()
    }

    override fun onDestroy() {
        mapView.dispose()
        super.onDestroy()
    }
    private fun setApiKeyForApp(){
        // set your API key
        // Note: it is not best practice to store API keys in source code. The API key is referenced
        // here for the convenience of this tutorial.

        ArcGISRuntimeEnvironment.setApiKey("AAPK364972f0ee304d718756a50110bf6c3fz_VV0hHNbc1H-2cevhv2M64Z0WENvF7JOyQh9PLiOlwTP1jgnxkmKDB-hElRpac6")

    }

}


