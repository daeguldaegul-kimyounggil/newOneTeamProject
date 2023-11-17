import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.lx.oneteamproject.R
import com.lx.oneteamproject.fragment.FragmentType
import com.lx.oneteamproject.databinding.FragmentReportCheckPopupBinding
import com.lx.oneteamproject.sub.SubActivity

class ReportCheckPopupFragment : DialogFragment() {

    private var _binding: FragmentReportCheckPopupBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentReportCheckPopupBinding.inflate(inflater, container, false)
        val view = binding.root

        // "신고하기" 버튼 클릭 시
        binding.button.setOnClickListener {
            // 원하는 동작 수행
            val intent = Intent(requireContext(), SubActivity::class.java).apply {
                putExtra("fragmentType", FragmentType.MYREPORTLIST.name)
            }
            startActivity(intent)

            // 팝업 닫기
            dismiss()
        }

        // "뒤로가기" 버튼 클릭 시
        binding.button2.setOnClickListener {
            // 팝업 닫기
            dismiss()
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
