package com.swapnil.sortabletabelview

import android.os.Build
import android.os.Bundle
import android.view.Gravity
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import de.codecrafters.tableview.TableView
import de.codecrafters.tableview.toolkit.SimpleTableDataAdapter
import de.codecrafters.tableview.toolkit.SimpleTableHeaderAdapter

class MainActivity : AppCompatActivity() {

    lateinit var tableView: TableView<Array<String>>
    val tableData: Array<Array<String>> = arrayOf(
        arrayOf("Store A", "0.0", "60.51", "1.2", "22", "-22.00", "Test", "All", "14.25%", "25.56%", "50.56%", "65.52%"),
        arrayOf("Store A", "0.0", "60.51", "1.2", "22", "-22.00", "Test", "All", "14.25%", "25.56%", "50.56%", "65.52%"),
        arrayOf("Store A", "0.0", "60.51", "1.2", "22", "-22.00", "Test", "All", "14.25%", "25.56%", "50.56%", "65.52%"),
        arrayOf("Store A", "0.0", "60.51", "1.2", "22", "-22.00", "Test", "All", "14.25%", "25.56%", "50.56%", "65.52%"),
        arrayOf("Store A", "0.0", "60.51", "1.2", "22", "-22.00", "Test", "All", "14.25%", "25.56%", "50.56%", "65.52%"),
        arrayOf("Store A", "0.0", "60.51", "1.2", "22", "-22.00", "Test", "All", "14.25%", "25.56%", "50.56%", "65.52%"),
        arrayOf("Store A", "0.0", "60.51", "1.2", "22", "-22.00", "Test", "All", "14.25%", "25.56%", "50.56%", "65.52%"),
        arrayOf("Store A", "0.0", "60.51", "1.2", "22", "-22.00", "Test", "All", "14.25%", "25.56%", "50.56%", "65.52%"),
        arrayOf("Store A", "0.0", "60.51", "1.2", "22", "-22.00", "Test", "All", "14.25%", "25.56%", "50.56%", "65.52%"),
        arrayOf("Store A", "0.0", "60.51", "1.2", "22", "-22.00", "Test", "All", "14.25%", "25.56%", "50.56%", "65.52%"),
        arrayOf("Store A", "0.0", "60.51", "1.2", "22", "-22.00", "Test", "All", "14.25%", "25.56%", "50.56%", "65.52%"),
        arrayOf("Store A", "0.0", "60.51", "1.2", "22", "-22.00", "Test", "All", "14.25%", "25.56%", "50.56%", "65.52%")
    )

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tableView = findViewById(R.id.tableView)
        tableView.setColumnCount(12);
        var simpleTableHeaderAdapter = SimpleTableHeaderAdapter(this, "", "FYTD", "P3M", "CM", "(+/-)PP", "(+/-)LY", " Coverage norm", "Covered", "%biz grwoing SOS", "%biz growing SOD", "%DGP", "%VGP")
        simpleTableHeaderAdapter.setTextColor(getColor(R.color.white))
        simpleTableHeaderAdapter.setTextSize(10)
        simpleTableHeaderAdapter.setGravity(Gravity.CENTER_HORIZONTAL)
        tableView.headerAdapter = simpleTableHeaderAdapter


        var simpleTableDataAdapter = SimpleTableDataAdapter(this, tableData)
        simpleTableDataAdapter.setTextSize(9)
        simpleTableDataAdapter.setGravity(Gravity.CENTER_HORIZONTAL)
        simpleTableDataAdapter.setTextColor(getColor(R.color.smokeBlack))
        tableView.dataAdapter = simpleTableDataAdapter
    }
}