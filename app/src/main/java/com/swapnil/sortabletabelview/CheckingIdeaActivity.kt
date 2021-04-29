package com.swapnil.sortabletabelview

import android.annotation.SuppressLint
import android.opengl.Visibility
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.TextView
import androidx.annotation.RequiresApi
import de.codecrafters.tableview.TableView
import de.codecrafters.tableview.toolkit.SimpleTableDataAdapter
import de.codecrafters.tableview.toolkit.SimpleTableHeaderAdapter

class CheckingIdeaActivity : AppCompatActivity() {

    val shareData = arrayOf(
        arrayOf("Store A", "0.0", "60.51", "1.2", "22", "-22.00"),
        arrayOf("Store A", "0.0", "60.51", "1.2", "22", "-22.00"),
        arrayOf("Store A", "0.0", "60.51", "1.2", "22", "-22.00"),
        arrayOf("Store A", "0.0", "60.51", "1.2", "22", "-22.00"),
        arrayOf("Store A", "0.0", "60.51", "1.2", "22", "-22.00"),
        arrayOf("Store A", "0.0", "60.51", "1.2", "22", "-22.00"),
        arrayOf("Store A", "0.0", "60.51", "1.2", "22", "-22.00"),
        arrayOf("Store A", "0.0", "60.51", "1.2", "22", "-22.00")
    )

    val sfData = arrayOf(
        arrayOf("Store A", "Test", "All", "14.25%", "25.56%", "50.56%", "65.52%"),
        arrayOf("Store A", "Test", "All", "14.25%", "25.56%", "50.56%", "65.52%"),
        arrayOf("Store A", "Test", "All", "14.25%", "25.56%", "50.56%", "65.52%"),
        arrayOf("Store A", "Test", "All", "14.25%", "25.56%", "50.56%", "65.52%"),
        arrayOf("Store A", "Test", "All", "14.25%", "25.56%", "50.56%", "65.52%"),
        arrayOf("Store A", "Test", "All", "14.25%", "25.56%", "50.56%", "65.52%"),
        arrayOf("Store A", "Test", "All", "14.25%", "25.56%", "50.56%", "65.52%"),
        arrayOf("Store A", "Test", "All", "14.25%", "25.56%", "50.56%", "65.52%")
    )

    lateinit var tableView: TableView<Array<String>>
    lateinit var sfTableView: TableView<Array<String>>

    lateinit var shareTextView: TextView
    lateinit var sfTextView: TextView

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checking_idea)

        tableView = findViewById(R.id.shareTableView)
        tableView.setColumnCount(6);
        var simpleTableHeaderAdapter = SimpleTableHeaderAdapter(this, "", "FYTD", "P3M", "CM", "(+/-)PP", "(+/-)LY")
        simpleTableHeaderAdapter.setTextColor(getColor(R.color.white))
        simpleTableHeaderAdapter.setTextSize(10)
        simpleTableHeaderAdapter.setGravity(Gravity.CENTER_HORIZONTAL)
        tableView.headerAdapter = simpleTableHeaderAdapter

        var simpleTableDataAdapter = SimpleTableDataAdapter(this, shareData)
        simpleTableDataAdapter.setTextSize(9)
        simpleTableDataAdapter.setGravity(Gravity.CENTER_HORIZONTAL)
        simpleTableDataAdapter.setTextColor(getColor(R.color.smokeBlack))
        tableView.dataAdapter = simpleTableDataAdapter



        sfTableView = findViewById(R.id.sfTableView)
        sfTableView.setColumnCount(7);
        var sfSimpleTableHeaderAdapter = SimpleTableHeaderAdapter(this, "", "Coverage norm", "Covered", "%biz grwoing SOS", "%biz growing SOD", "%DGP", "%VGP")
        sfSimpleTableHeaderAdapter.setTextColor(getColor(R.color.white))
        sfSimpleTableHeaderAdapter.setTextSize(10)
        sfSimpleTableHeaderAdapter.setGravity(Gravity.CENTER_HORIZONTAL)
        sfTableView.headerAdapter = sfSimpleTableHeaderAdapter


        var sfSimpleTableDataAdapter = SimpleTableDataAdapter(this, sfData)
        sfSimpleTableDataAdapter.setTextSize(9)
        sfSimpleTableDataAdapter.setGravity(Gravity.CENTER_HORIZONTAL)
        sfSimpleTableDataAdapter.setTextColor(getColor(R.color.smokeBlack))
        sfTableView.dataAdapter = sfSimpleTableDataAdapter


        shareTextView = findViewById(R.id.txtShare)
        sfTextView = findViewById(R.id.txtSF)

        shareTextView.setOnClickListener {
            tableView.visibility = View.VISIBLE
            sfTableView.visibility = View.GONE
            shareTextView.setBackgroundColor(getColor(R.color.colorPrimaryDark))
            sfTextView.setBackgroundColor(getColor(R.color.navTable))
        }
        sfTextView.setOnClickListener {
            tableView.visibility = View.GONE
            sfTableView.visibility = View.VISIBLE
            sfTextView.setBackgroundColor(getColor(R.color.colorPrimaryDark))
            shareTextView.setBackgroundColor(getColor(R.color.navTable))
        }

    }
}