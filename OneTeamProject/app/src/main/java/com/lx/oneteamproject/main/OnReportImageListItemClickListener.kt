package com.lx.oneteamproject.main

import android.view.View

interface OnReportImageListItemClickListener {

    fun onReportImageListItemClick(holder: ReportImageListAdapter.ViewHolder, view: View?, position: Int)
}