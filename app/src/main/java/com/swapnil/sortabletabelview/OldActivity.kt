package com.swapnil.sortabletabelview

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import de.codecrafters.tableview.TableView
import de.codecrafters.tableview.toolkit.SimpleTableDataAdapter
import de.codecrafters.tableview.toolkit.SimpleTableHeaderAdapter

class OldActivity : AppCompatActivity() {
    lateinit var tableView: TableView<Array<String>>
    //    val tableHeader = arrayOf("ID", "Name", "Email", "Phone No.")
    val tableData: Array<Array<String>> = arrayOf(
        arrayOf("1", "Amit", "amit@example.com", "123456789"),
        arrayOf("1", "Amit", "amit@example.com", "123456789"),
        arrayOf("1", "Amit", "amit@example.com", "123456789"),
        arrayOf("1", "Amit", "amit@example.com", "123456789"),
        arrayOf("1", "Amit", "amit@example.com", "123456789"),
        arrayOf("1", "Amit", "amit@example.com", "123456789"),
        arrayOf("1", "Amit", "amit@example.com", "123456789"),
        arrayOf("1", "Amit", "amit@example.com", "123456789"),
        arrayOf("1", "Amit", "amit@example.com", "123456789"),
        arrayOf("1", "Amit", "amit@example.com", "123456789")
    )

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_old)

        tableView = findViewById(R.id.tableView)
        var simpleTableHeaderAdapter = SimpleTableHeaderAdapter(this, "ID", "Name", "Email", "Phone No.")
        simpleTableHeaderAdapter.setTextColor(getColor(R.color.white))
        tableView.headerAdapter = simpleTableHeaderAdapter
        tableView.dataAdapter = SimpleTableDataAdapter(this, tableData)
//        tableView.headerAdapter = SimpleTableHeaderAdapter(this, TABLE_HEADERS)
    }
}