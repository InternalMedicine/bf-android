package umc.hackathon.data.datasource

import umc.hackathon.model.JobPosting

interface JobPostingDataSource {
    suspend fun getRecommendJobPostings(): List<JobPosting>
    suspend fun getDetailJobPosting(id: Int): JobPosting?
}