package com.example.task02

object CloudRepository {
    val list: List<Cloud> = listOf(
        Cloud(id = 0, name = "Cloud0", description = "Fluffy cloud", url = "https://images.unsplash.com/photo-1536514498073-50e69d39c6cf?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1171&q=80"),
        Cloud(id = 1, name = "Cloud1", description = "Gray cloud", url = "https://images.unsplash.com/photo-1516469679150-4fdd1f114f97?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8ZGFyayUyMGNsb3VkfGVufDB8fDB8fHww&auto=format&fit=crop&w=600&q=60"),
        Cloud(id = 2, name = "Cloud2", description = "Rain cloud", url = "https://images.unsplash.com/photo-1591552265137-99c59d9f4927?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1332&q=80"),
        Cloud(id = 3, name = "Cloud3", description = "Thundercloud", url = "https://images.unsplash.com/photo-1533647188310-52eeae6d8a6e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8VGh1bmRlcmNsb3VkfGVufDB8fDB8fHww&auto=format&fit=crop&w=600&q=60"),
        Cloud(id = 4, name = "Cloud4", description = "Sky without clouds", url = "https://images.unsplash.com/photo-1592698117601-70c282996f9c?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDF8fHNreXxlbnwwfDB8MHx8fDA%3D&auto=format&fit=crop&w=600&q=60"),
        Cloud(id = 5, name = "Cloud5", description = "Dark cloud", url = "https://images.unsplash.com/photo-1534358594138-6955f589fa24?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8ZGFyayUyMGNsb3VkfGVufDB8fDB8fHww&auto=format&fit=crop&w=600&q=60"),
        Cloud(id = 6, name = "Cloud6", description = "Bright cloud", url = "https://images.unsplash.com/photo-1501630834273-4b5604d2ee31?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8Y2xvdWR8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=600&q=60"),
        Cloud(id = 7, name = "Cloud7", description = "Light cloud", url = "https://images.unsplash.com/photo-1576954115039-9aebebb79ad2?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8bGlnaHQlMjBjbG91ZHN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=600&q=60"),
    )

    fun getCloudById(id: Int): Cloud? {
        return list.find { it.id == id }
    }
}